package com.ericsson.threads;

class A {
	public synchronized void display(String msg) {//[welcome][new][java programmer]
		System.out.print("[" + msg);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class B extends Thread {
	String msg;
	A a;// has-a

	B(A fp, String str) {
		a = fp;
		msg = str;
		this.start();
	}

	public void run() {
		a.display(msg);
	}
}

public class ThreadWithOutSync {
	public static void main(String[] args) {
		A fnew = new A();
		B ss = new B(fnew, "welcome");// has-a
		B ss1 = new B(fnew, "new");
		B ss2 = new B(fnew, "java programmer");
	}
}