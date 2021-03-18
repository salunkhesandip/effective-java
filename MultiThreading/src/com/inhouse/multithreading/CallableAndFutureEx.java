package com.inhouse.multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureEx {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Callable<Integer> task = ()->{
			Random random = new Random();
			int duration = random.nextInt(1000);
			System.out.println("Callable starts...");
			Thread.sleep(duration);

			
			if(duration > 500)
				throw new IOException();
			System.out.println("Callable ends...");
			
			return duration;
			};
			
		Future<Integer> future = executor.submit(task);
		// Future class represents a future result of an asynchronous computation – 
		// a result that will eventually appear in the Future after the processing is complete.
		// Long running methods are good candidates for asynchronous processing and the Future interface. 
		// This enables us to execute some other process while we are waiting for the task encapsulated in Future to complete.
		
		executor.shutdown();
		
		try {
			System.out.println(future.get());
			// get() will block the execution until the task is complete.
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
