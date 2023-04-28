package com.ericsson.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx2  extends Thread
{
	static CopyOnWriteArraySet al=new CopyOnWriteArraySet();

	public void run() 
	{
	try {
		sleep(2000);
	} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("ChildThread updating AL");
	al.add("C");
	}
public static void main(String[] args) throws InterruptedException {
	al.add("A");
	al.add("B");
	al.add("B");
	CopyOnWriteArraySetEx2 ca=new CopyOnWriteArraySetEx2();
	ca.start();
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		String values=(String) itr.next();
		System.out.println("MainThread iterating al values :"+values);
		Thread.sleep(2000);
	}	
	System.out.println(al);
}
}
