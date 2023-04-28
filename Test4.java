package com.java8features;
interface LamdaEx1
{
	 int squareOfNum(int n);
	}
public class Test4 {
	public static void main(String[] args) 
	{
	LamdaEx1 e=(n)->(n*n);
	System.out.println(e.squareOfNum(12));
	System.out.println(e.squareOfNum(2));
	}

}
