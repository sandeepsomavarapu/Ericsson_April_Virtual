package com.java8features;

/*interface Favorite
{  
    public void color();  
}  
public class Basic implements Favorite
{
	public static void main(String[] args) 
	{  
       
       Basic b=new Basic();
       b.color();
    }

	public void color() {
		System.out.println("Red");
	}  
}*/
interface Favorite
{  
    public void color();  
}  
public class Basic 
{
	public static void main(String[] args) 
	{  
        String color="'blue'";    
        Favorite f=()->{System.out.println("My favourite color is: "+color);};
        f.color();  
    }  
}