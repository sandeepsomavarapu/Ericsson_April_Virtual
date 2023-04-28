package com.java8features;

interface Parent {
	public void multiplication(int a, int b);
}

public class ConstructorReferecnceEx {
	ConstructorReferecnceEx(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Parent parent = ConstructorReferecnceEx::new;
		parent.multiplication(12, 12);

	}
}
