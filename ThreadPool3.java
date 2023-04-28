package com.ericsson.threads;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadPool3 {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	//for scheduling tasks
	ExecutorService service=	Executors.newFixedThreadPool(10);
	List<Future> allfutures=new ArrayList();
	for (int i = 0; i < 100; i++) {
	Future future=service.submit(new Task3());
	allfutures.add(future);
	}
	for(int i=0;i<100;i++){
	Future<Integer> future=allfutures.get(i);
	Integer result=future.get();
	System.out.println(result);
	}
}
}
class Task3 implements Callable<Integer>
{
	public Integer call() throws Exception {
		Thread.sleep(3000);
		return new Random().nextInt();
	}
	}
