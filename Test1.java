package com.java8features;
interface Sub{  
    int calculator(int a,int b);  
}  
public class Test1 {  
    public static void main(String[] args) {  
        //without return keyword.  
        Sub s1=(a,b)->(a-b);  
        System.out.println(s1.calculator(100,20));  
        //with return keyword.    
        Sub s2=(a,b)->{return (a+b);};  
        System.out.println(s2.calculator(1000,200));  
        //with data types
        Sub s3=(int a,int b)->{return (a*b);};  
        System.out.println(s3.calculator(1000,200)); 
    }  
}  