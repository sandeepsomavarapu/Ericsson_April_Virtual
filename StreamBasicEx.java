package com.java8features;

import java.util.stream.Stream;

public class StreamBasicEx
{
     public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of(1,2,7,10,5,6,7,8,9);
         stream.forEach(x -> System.out.println(x));
     }
}