package com.java8features;

import java.util.stream.Stream;

public class StreamEx1
{
     public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream.forEach(y -> System.out.println());
     }
}