package com.ericsson.oops;

class ParentEx {
	int age = 45;

	ParentEx() {
		this(123);
		System.out.println("default constructor from parent ");
	}
	ParentEx(int age) {
		System.out.println("param constructor from parent "+age);
	}
	public void m2() {
		System.out.println("Am from m2 method of parent class");
	}
}

public class ThisSuperEx extends ParentEx {
	int age = 30;

	ThisSuperEx() {
		super();
		// this("breaktime");
		System.out.println("default constructor from child");
	}

	ThisSuperEx(String name) {
		System.out.println("param constructor" + name);
	}

	public void m1(int age) {
		System.out.println("Your age :" + age + "  " + this.age + " " + super.age);
		System.out.println(this);
		this.m2();
		super.m2();
	}

	public void m2() {
		System.out.println("Am from m2 method of current class");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx();
		obj.m1(29);
	}

}
