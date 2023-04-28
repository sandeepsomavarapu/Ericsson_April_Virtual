package com.ericsson.threads;
class First
{
 public synchronized void display(String msg)//[welcome][new][java programmer]
 {
  System.out.print("["+msg);
  try{Thread.sleep(3000);}catch(InterruptedException e){e.printStackTrace();}
  System.out.println ("]");
 }
}
class Second extends Thread//is-a
{
 String msg;//welcome,new
 First fobj;//has-a
 
 Second (First fobj,String msg)
 {
  this.fobj = fobj;
 this.msg = msg;
  this.start();
 }
 public void run()
 {
  fobj.display(msg);//new
 }
}
public class ThreadWithSync
{
 public static void main (String[] args) 
 {
  First fnew = new First();
  
  Second ss = new Second(fnew, "welcome");
  
  Second ss1= new Second (fnew,"new");
  
  Second ss2 = new Second(fnew, "java programmer");
  
 }
}