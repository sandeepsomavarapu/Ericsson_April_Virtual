package com.ericsson.oops;

public class MethodOverloadingEx {
	public void add(float a, float b) {
		System.out.println("add of two float's :" + (a + b));
	}

//	public void add(int a, int b) {
//		System.out.println("add of two int's :" + (a + b));
//	}

	public void add(int a, int b, int c) {
		System.out.println("add of three int's :" + (a + b + c));
	}



	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();

		obj.add(11, 12);
		obj.add(11, 12, 13);
		obj.add(23.4f, 34.2f);
		obj.add(23, 34.5f);
		obj.add('a','b');
	}

}
