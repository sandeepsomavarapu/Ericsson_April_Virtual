package com.ericsson.threads;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("ericsson");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		MyThread1 obj = new MyThread1();
		obj.start();

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	}

}
