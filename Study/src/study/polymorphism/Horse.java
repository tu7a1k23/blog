package study.polymorphism;

class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public void sound2(){
        System.out.println("Neigh2");
    }
    public static void main(String args[]){
    	Animal obj = new Horse(); //You have to use/override function from Animal, you can't use other new creating functions.
    	obj.sound();
    	//-----------Difference between 2 declarations-----------
    	Horse obj2 = new Horse();	//You can use any function you want
    	obj2.sound2();
    }
}