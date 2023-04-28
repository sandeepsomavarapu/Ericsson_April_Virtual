package com.java8features;

/*class Test 
{ 
    public static void main(String args[]) 
    { 
        // create anonymous inner class object 
        new Thread(new Runnable() 
        { 
          public void run() 
            { 
               for(int i=1;i<=10;i++)
               {
            	   System.out.println(i);
               }
            } 
        }).start(); 
    } 
} */

class Test 
{ 
  public static void main(String args[]) 
  { 
  
    // lambda expression to create the object 
    new Thread(()-> 
       {for(int i=1;i<=10;i++)
          {
       	   System.out.println(i);
          }}).start(); 
  } 
}



/*class Test implements  Runnable
{
	public void run() {
		  for(int i=1;i<=10;i++)
          {
       	   System.out.println(i);
          }
	}
	public static void main(String[] args) {
		Test t=new Test();
		Thread t1=new Thread(t);
		t1.start();
	}
	}*/