package com.java8features;

@FunctionalInterface
interface Calculator {

	public int caluculation(int a, int b);
}

public class MethodReferenceEx {

	public static int m1(int a, int b) {
		return a + b;
	}

	public int m2(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {//::
		Calculator calc = (a, b) -> a + b;
		System.out.println(calc.caluculation(12, 13));

		Calculator calc1 = MethodReferenceEx::m1;
		System.out.println(calc1.caluculation(12, 1));

		MethodReferenceEx obj = new MethodReferenceEx();

		Calculator calc2 = obj::m2;
		System.out.println(calc2.caluculation(12, 1));
	}

}
