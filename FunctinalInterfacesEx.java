package com.java8features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FunctinalInterfacesEx {
public static void main(String[] args) {
	Predicate<Integer> predicate = a -> a % 2 == 0;//Predicate,IntPredicate
	System.out.println(predicate.test(12));
	IntPredicate intpredicate=b->b%2==0;
	Predicate<String> predicate1 = name -> name.length() > 6;
	System.out.println(predicate1.test("sandeep"));

	Function<String, Integer> function = name -> name.length();
	System.out.println(function.apply("sandeep"));

	Function<String, String> function1 = name -> name.toUpperCase();
	System.out.println(function1.apply("sandeep"));
	Integer[] array = { 1, 2, 3, 4, 5, 3, 43, 90 };

	Consumer<Integer[]> consumer = arr -> {
		for (int i = 0; i < array.length; i++) 
			System.out.println(arr[i]);
	};
	consumer.accept(array);
	
	BiPredicate<Integer,Integer> bipredicate=(a,b)->a+b>25;
	bipredicate.test(12, 23);//BiFUnction
	BiFunction<String,String, Integer> bifunction = (name,fname) -> name.concat(fname).length();
	System.out.println(bifunction.apply("sandeep","somavarapu"));
}
}
