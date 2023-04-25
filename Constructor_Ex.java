package com.ericsson.oops;

import java.util.Date;

public class Constructor_Ex {

	public Constructor_Ex() {
		System.out.println("Default constructor...");
	}

	public Constructor_Ex(String orgName) {
		System.out.println("Param constructor..." + orgName);
	}

	public Date printDate() {
		return new Date();
	}

	public static void main(String[] args) {
		Constructor_Ex obj = new Constructor_Ex();
		Constructor_Ex obj1 = new Constructor_Ex("ericsson");
		System.out.println(obj.printDate());
	}
}
