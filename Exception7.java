package com.ericsson.exceptions;

import java.util.Scanner;

public class Exception7 {

	public static void validate(String username, String password) {
		if (username.equals("ericsson") && password.equals("ericsson123")) {
			System.out.println("LOGIN SUCCESS");
		} else {
			throw new InvalidCredentials("Enter Valid Credentials");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = scan.next();
		System.out.println("Enter Password");
		String password = scan.next();
		Exception7.validate(username, password);

	}

}
