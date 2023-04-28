package com.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaWithCollectionsAndStreams {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(15);
		al.add(5);
		System.out.println("ArrayList Values :" + al);

//		ArrayList<Integer> al1 = new ArrayList();
//		Iterator<Integer> itr = al.iterator();
//		while (itr.hasNext()) {
//			int i = itr.next();
//			if (i % 2 == 0) {
//				al1.add(i);
//			}
//		}
//		System.out.println(al1);

		// stream api terminal & intermediate al.stream()

		List<Integer> l = al.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("after filter to print even values: " + l);

		System.out.println("map to print double value ");
		List<Integer> l1 = al.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("map to print double value " + l1);

		long cn = al.stream().count();
		System.out.println("it will count no of elements " + cn);

		List<Integer> l2 = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());

		System.out.println("displayed in descending order " + l2);

		Integer minVal = al.stream().min((i1, i2) -> -i1.compareTo(i2)).get();

		System.out.println("minimumvalue is ... " + minVal);
		Integer maxVal = al.stream().max((i1, i2) -> -i1.compareTo(i2)).get();

		System.out.println("Maximum..value is ... " + maxVal);
		// printing using foreach

		al.stream().forEach(i -> {
			System.out.println("the elements are " + i);
		});
		al.stream().forEach(System.out::println);
		// to array list to array
		Object[] a = al.parallelStream().toArray();
		System.out.println("the array elements are ");

		for (Object a1 : a) {
			System.out.println(a1);
		}

	}

}
