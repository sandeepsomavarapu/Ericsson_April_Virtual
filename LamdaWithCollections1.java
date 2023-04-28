package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class LamdaWithCollections1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ae=new  ArrayList<Integer>();
		ae.add(23);
		ae.add(13);
		ae.add(43);
		ae.add(22);
		ae.add(26);
		ae.add(20);
		System.out.println(ae);
		Comparator<Integer> c=(o1,o2)->{return (o1<o2)?1:(o1>o2)?-1:0;};
		Collections.sort(ae,c);
		System.out.println(ae);
	}	
}