package com.java8features;

import java.util.ArrayList;
import java.util.List;
public class Test2{  
    public static void main(String[] args) {  
        List<String> list=new ArrayList<String>();  
        
        list.add("suresh");  
        list.add("naresh");  
        list.add("ramesh");  
        list.add("mahesh");  
        
        list.forEach((n)->System.out.println(n));  
        
       /*ListIterator itr= list.listIterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }*/
        
       /* for (String string : list) {
			System.out.println(string);
		}*/
        
    }  
}  