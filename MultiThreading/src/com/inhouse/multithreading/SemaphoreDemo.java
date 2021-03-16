package com.inhouse.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		for(int i=0;i<10;i++) {
			Runnable task = ()->{DbConnection.getInstance().connect();};
			executor.submit(task);
		}
		
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
}
