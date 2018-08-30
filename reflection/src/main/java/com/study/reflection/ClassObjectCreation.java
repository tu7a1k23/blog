package com.study.reflection;

import java.lang.reflect.*;
/**
 * Hello world!
 *
 */
public class ClassObjectCreation {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1 - By using Class.forname() method
		Class c1 = Class.forName("Guru99ClassObjectCreation");
		// 2- By using getClass() method
		ClassObjectCreation guru99Obj = new ClassObjectCreation();
		Class c2 = guru99Obj.getClass();
		// 3- By using .class
		Class c3 = ClassObjectCreation.class;
	}
}
