package com.ericsson.collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueEx1 
{
public static void main(String[] args) 
{

	
	ConcurrentLinkedQueue cm=new ConcurrentLinkedQueue();
	cm.add("x");
	cm.add("z");
	cm.add("a");
	System.out.println(cm);
}
}
