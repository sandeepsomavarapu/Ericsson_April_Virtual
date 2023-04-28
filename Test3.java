package com.java8features;
interface Lamda
{
void m1();
}
class LamdaImpl implements Lamda
{
	public void m1() 
	{
	System.out.println("Implementation provided in normal way");	
	}
}
public class Test3 
{
	public static void main(String[] args) 
	{
		LamdaImpl l=new LamdaImpl();
		l.m1();
		
	}
}
