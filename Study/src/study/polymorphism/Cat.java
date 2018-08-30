package study.polymorphism;

public class Cat{

    public static int sound(){
        System.out.println("Meow");
        return 5;
    }
    public static void main(String args[]){
//    	Animal obj = new Cat();
//    	obj.sound();
//    	Cat obj2 = new Cat();
//    	obj2.sound();
    	int a = sound();	// Return function have both return and void features, event it's just declaration the void feature still works
    }
}
