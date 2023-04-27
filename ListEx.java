package com.ericsson.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//1)collections can hold both homogeneous and heterogeneous data 
//2)collections are not  fixed in size and  growable in nature 
//3)lots of utility methods 
//1)duplicates are allowed
//2)insertion order is followed

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10...16 (cc*3/2)+1
		al.add("mahesh");
		al.add("suresh");
		al.add("rajesh");
		al.add("somesh");
		al.add("akash");
		al.add("mahesh");
		al.add("naresh");
		al.add(1,"ericsson");
		System.out.println(al);

		
		
		ListIterator<String> listIterator=al.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		System.out.println("********************");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		
		
		
		
//		
//		Iterator<String> itr = al.iterator();
//
//		while (itr.hasNext()) {
//			String name = itr.next();
//			if (name.endsWith("esh"))
//				System.out.println(name);
//		}

//		ArrayList<String> al1 = new ArrayList<String>();
//		al1.add("sandeep");
//		al1.add("ramesh");
//		System.out.println(al1);
//
//		al1.addAll(al);
//		System.out.println(al1);
//		
//		//al1.removeAll(al);
//		al1.retainAll(al);
//		System.out.println(al1);
//		System.out.println(al1.contains("akash"));

	}

}
