package com.ericsson.collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapEx2 extends Thread
{	
	static ConcurrentHashMap chm=new ConcurrentHashMap();	
	public void run() 
	{
	try
	{
		Thread.sleep(2000);
	}catch(InterruptedException ie)
	{ie.printStackTrace();}
	System.out.println("child thread got chance");
	chm.put(40, "welcome to IBM");
	}
	public static void main(String[] args) throws InterruptedException {	
		chm.put(10,"welcome");
		chm.put(20,"hello");
		chm.put(30,"hai");
		ConcurrentHashMapEx2 t=new ConcurrentHashMapEx2();
		t.start();
		Set s=chm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.println("main Thread Iterating...");
			System.out.println("current key is.. : "+i+" and value :"+chm.get(i));
			Thread.sleep(1000);
		}
	System.out.println(chm);	
	}
	
}
