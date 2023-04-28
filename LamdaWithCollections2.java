package com.java8features;

import java.util.ArrayList;
import java.util.Iterator;

public class LamdaWithCollections2 
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
		Iterator<Integer> itr=ae.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//ae.stream().forEach(System.out::println);
	}
}
