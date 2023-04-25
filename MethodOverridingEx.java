package com.ericsson.oops;

import java.util.Date;

 class Details {		//final -->Before variable/method/class
	 int age = 32;

	public final void printDate() {
		Date date = new Date();
		System.out.println("Today's Date : " + date);
	}

	public  void printAge() {
		++age;
		System.out.println("Your Age is : " + age);
	}
}

public class MethodOverridingEx extends Details {
	public void sayHello() {
		System.out.println("Hello Everyone..");
	}
	@Override
	public void printAge() {
		--age;
		System.out.println("Your Age is : " + age);
	}
	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.printAge();
		obj.printDate();
		obj.sayHello();
	}

}
