package com.ericsson.collections;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {

		HashMap<Integer, String> students = new HashMap<Integer, String>();

		students.put(111, "mahesh");
		students.put(121, "suresh");
		students.put(713, "rajesh");
		students.put(999, "naresh");
		students.put(111, "somesh");
		students.put(199, "akash");// Entry

		System.out.println(students);

//		Set<Integer> keys = students.keySet();
//
//		Iterator<Integer> mapKeys = keys.iterator();
//
//		while (mapKeys.hasNext()) {
//			int key = mapKeys.next();
//			System.out.println(key + " " + students.get(key));
//		}

		
		
		Set<Entry<Integer,String>> keys1 = students.entrySet();

		Iterator<Entry<Integer,String>> mapKeys1 = keys1.iterator();

		while (mapKeys1.hasNext()) {
			Entry<Integer,String> key = mapKeys1.next();
			System.out.println(key.getKey()+" "+key.getValue());
		}

		
		
		
		
		
		
		
		
		
//		System.out.println(students.containsKey(199));
//		System.out.println(students.containsValue("sandeep"));
//		HashMap<Integer, String> students1 = new HashMap<Integer, String>();
//		students1.put(564, "sandeep");
//		students1.put(858, "phani");
//
//		students1.putAll(students);
//		System.out.println(students1);
	}
}
