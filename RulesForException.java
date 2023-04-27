package com.ericsson.exceptions;
class A
{
	public void add(String a,String b)
	{
		int c=Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("Add of two numbers :"+c);
	}
	public void sub(String a,String b) throws  Exception
	{
		int c=Integer.parseInt(a)-Integer.parseInt(b);
		System.out.println("sub of two numbers "+c);
	}
	}
public class RulesForException extends A
{
	public void add(String a,String b)throws ArithmeticException
	{
		int c=Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("Addition of two numbers :"+c);
	}
	public void sub(String a,String b)throws  ArithmeticException	{
		int c=Integer.parseInt(a)-Integer.parseInt(b);
		System.out.println("subtraction of two numbers :"+c);
	}
	public static void main(String[] args) 
{
	RulesForException re=new RulesForException();
	re.add("12","13");
	re.sub("11","12");
}
}
