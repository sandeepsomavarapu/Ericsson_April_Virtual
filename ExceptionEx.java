package com.ericsson.exceptions;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division ");
		int fnum = scan.nextInt();
		System.out.println("Enter second number for division ");
		int snum = scan.nextInt();
		try {
			int result = fnum / snum;
			System.out.println("division of two numbers : " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Remaining 1000 lines of code");

	}

}
