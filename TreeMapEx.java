package com.java8features;
import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapEx 
{
public static void main(String[] args) 
{
	Comparator<Integer> c=(i1,i2)->{return (i1<i2)?1:(i1>i2)?-1:0;};
	Comparator<Integer> c1=(i1,i2)->{return -i1.compareTo(i2);};
	Comparator<Integer> c2=(i1,i2)->{return i2.compareTo(i1);};
	
	TreeMap<Integer, String> t=new TreeMap<Integer,String>(c);
	t.put(200,"akash");
	t.put(60,"suresh");
	t.put(30,"naresh");
	t.put(40,"ramesh");
	System.out.println(t);
}
}
