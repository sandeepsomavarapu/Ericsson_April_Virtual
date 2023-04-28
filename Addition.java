package com.java8features;

interface Add{  
    int addition(int a,int b);  
}  
  
public class Addition{  
    public static void main(String[] args) {  
         
        // Multiple parameters  
        
    	Add ad1=(a,b)->(a+b);
        
        System.out.println(ad1.addition(10,20));  

    }  
}  