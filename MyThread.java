package com.ericsson.threads;

public class MyThread implements Runnable {
	@Override
	public void run() {
			
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread ....");
		}
	}

	public static void main(String[] args) {

		MyThread thread = new MyThread();

		Thread thread1 = new Thread(thread);

		thread1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ....");// thread scheduler priority 1-10 5 main
		}

	}
}
