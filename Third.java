package com.java8features;

interface Display1{  
    public String print(String name);  
}  
public class Third{  
    public static void main(String[] args) {  
      
        //  with single parameter.  
    	Display1 m1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(m1.print("Akash"));  
             
        Display1 m2=(name)->{  
            return "hai, "+name;  
        };  
        System.out.println(m2.print("suresh")); 
}  }