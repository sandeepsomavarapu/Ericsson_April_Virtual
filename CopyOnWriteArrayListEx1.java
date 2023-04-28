package com.ericsson.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx1 
{
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add("X");
	al.add("Y");
	System.out.println(al);

	CopyOnWriteArrayList cowa=new CopyOnWriteArrayList();
	cowa.addIfAbsent("A");
	cowa.add("B");
	cowa.addIfAbsent("B");
	System.out.println(cowa);
	cowa.addAllAbsent(al);
	System.out.println(cowa);
	ArrayList al1=new ArrayList();
	al1.add("X");
	al1.add("Y");
	al1.add("Z");
	System.out.println(al1);

	cowa.addAllAbsent(al1);
	System.out.println(cowa);
	
}
	
	
	
}
