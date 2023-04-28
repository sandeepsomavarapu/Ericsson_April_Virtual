package com.ericsson.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
public static void main(String[] args) {
	//create the pool
	ExecutorService service=	Executors.newCachedThreadPool();
	//submit tasks for execution
	for(int i=0;i<100;i++)
	{service.execute(new Task1());}
	System.out.println("Thread name :"+Thread.currentThread().getName());
}
}
class Task1 implements Runnable
{
	public void run() {
		System.out.println("Thread name :"+Thread.currentThread().getName());
	}
	}
