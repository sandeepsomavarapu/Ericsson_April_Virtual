package com.ericsson.oops;

// java.lang is the  BY default package for every java file
//java.lang.Object is the super class for every java class 
//ctrl+shift+f,ctrl+shift+O,ctrl+//
class SuperParent {
	int age = 32;

	public void mod(int a, int b) {
		System.out.println("mod of two integers " + (a % b));
	}
}

class Parent extends SuperParent {
	int marks = 200;

	public void div(int a, int b) {
		System.out.println("div of two integers " + (a / b));
	}

	public void mul(int a, int b) {
		System.out.println("mul of two integers " + (a * b));
	}
}

public class Inheritance_Ex extends SuperParent {
	public void add(int a, int b) {
		System.out.println("add of two integers " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two integers " + (a - b));
	}

	public static void main(String[] args) {
		Inheritance_Ex obj = new Inheritance_Ex();
		obj.add(12, 13);
		obj.sub(22, 33);
		// obj.div(10, 2);
		obj.mod(20, 5);
		// obj.mul(2, 3);
		// System.out.println(obj.marks);
		System.out.println(obj.age);

	}
}
