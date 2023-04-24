package com.ericsson.basics;

import java.util.Scanner;

public class Scanner_Test {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number for addition");
		int a = scan.nextInt();
		System.out.println("enter second number for addition");
		int b = scan.nextInt();
		System.out.println("enter name");
		String name = scan.next();
		int result = a + b;

		System.out.println("addition of two numbers  is: " + result);
		System.out.println(".."+name);
		scan.close();
	}
}
