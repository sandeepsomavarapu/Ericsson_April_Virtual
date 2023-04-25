package com.ericsson.oops;

// java.lang is the  BY default package for every java file
//java.lang.Object is the super class for every java class 
//ctrl+shift+f,ctrl+shift+O,ctrl+//
interface SuperParent1 {
	int age = 32;// public static final int age

	void mod(int a, int b);// public abstract void mod(int a,int b)
}

abstract class Parent1 implements SuperParent1 {
	int marks = 200;

	public void div(int a, int b) {
		System.out.println("div of two integers " + (a / b));
	}

	public abstract void mul(int a, int b);
}

public class ClassAbtractInterface_Ex extends Parent1 {
	public void add(int a, int b) {
		System.out.println("add of two integers " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two integers " + (a - b));
	}

	public static void main(String[] args) {
		ClassAbtractInterface_Ex obj = new ClassAbtractInterface_Ex();
		obj.add(12, 13);
		obj.sub(22, 33);
		obj.div(10, 2);
		obj.mod(20, 5);
		obj.mul(2, 3);
		System.out.println(obj.marks);
		System.out.println(obj.age);

	}

	@Override
	public void mod(int a, int b) {
		System.out.println("a%b");
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("a*b");
	}
}
