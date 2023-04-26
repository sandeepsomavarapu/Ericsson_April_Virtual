package com.ericsson.stringex;

public class TestString {

	public static void main(String[] args) {
	String name="ericsson";
	String name1="ericsson"; //imuutable
	
	System.out.println(name.equals(name1));//true
	System.out.println(name.compareTo(name1));//0
	System.out.println(name==name1);//true
	
	
	
	String name2=new String("ericsson");
	String name3=new String("ericsson"); //imuutable
	
	
	System.out.println(name2.equals(name3));//true
	System.out.println(name2.compareTo(name3));//0
	System.out.println(name2==name3);//false
	
	
	System.out.println("ericsson".compareTo("ericsson"));
	
	
	//returns -ve if obj1 has to come before obj2
	//returns +ve if obj1 has to come after obj2
	//returns 0 if both are same 
	

	StringBuilder sb=new StringBuilder("ericcson");
	StringBuilder sb1=new StringBuilder("ericcson");
	
//	sb.append(" hyderabad");//muttable
	
//	System.out.println(sb);
	
	
	System.out.println(sb.equals(sb1));//==
	System.out.println(sb==sb1);
	
	
	

	
//	System.out.println(name.concat(" india"));//ericsson india GC
//
//System.out.println(name);
	}

}
