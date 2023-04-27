package com.ericsson.collections;

import java.util.TreeSet;

//1)collections can hold both homogeneous and heterogeneous data 
//2)collections are not  fixed in size and  growable in nature 
//3)lots of utility methods 
//1)duplicates are not allowed
//2)insertion order is not followed
public class SetEx {

	public static void main(String[] args) {

		TreeSet<String> hs = new TreeSet<String>();// 16
		hs.add("mahesh");
		hs.add("suresh");
		hs.add("rajesh");
		hs.add("somesh");
		hs.add("akash");
		hs.add("mahesh");
		hs.add("naresh");
		System.out.println(hs);

	}

}
