/*
	Hi Brian T!
*/
package com.study.reflection;

import java.io.Serializable;
import java.lang.reflect.Modifier;

public abstract class Guru99Base implements Serializable,Cloneable {
	public static void main (String [] args) throws ClassNotFoundException { 
		// Create Class object for Guru99Base.class 
		Class guru99ClassObj = Guru99Base.class;
		
		// Print name of the class 
		System.out.println("Name of the class is : " +guru99ClassObj.getName());
		
		// Print Super class name
		System.out.println("Name of the super class is : " +guru99ClassObj.getSuperclass().getName());
		
		// Get the list of implemented interfaces in the form of Class array using getInterface() method
		Class[] guru99InterfaceList = guru99ClassObj.getInterfaces();
		
		// Print the implemented interfaces using foreach loop 
		System.out.print("Implemented interfaces are : ");
		for (Class guru99class1 : guru99InterfaceList)	{
			System.out.print(guru99class1.getName() + " ");
		}
		System.out.println();
		
		//Get access modifiers using get Modifiers() method and toString() method of java.lang.reflect.Modifier class
		int guru99AccessModifier= guru99ClassObj.getModifiers(); 
		// Print the access modifiers
		System.out.println("Access modifiers of the class are : " +Modifier.toString(guru99AccessModifier));
		
		}
}