package com.java8features;

public class LamdaWithThread {
	public static void main(String args[]) {
		Runnable r=()->{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Child Thread");}};
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main Thread");
		}
	}
}
