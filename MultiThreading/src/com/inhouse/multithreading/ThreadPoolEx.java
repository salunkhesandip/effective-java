package com.inhouse.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* 
 * Executor - An object that executes submitted Runnable tasks. 
 * This interface provides a way of decoupling task submission from the mechanics of how each task will be run, 
 * including details of thread use, scheduling, etc.
 * An Executor is normally used instead of explicitly creating threads. 
 * For example, rather than invoking new Thread(new RunnableTask()).start() for each of a set of tasks, you might use: 
 * Executor executor = anExecutor();
 * executor.execute(new RunnableTask1());
 * executor.execute(new RunnableTask2());
 */

public class ThreadPoolEx {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<6 ;i++)
			executor.submit(new RunnableTask(i)); //An object that executes submitted Runnable tasks

		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasks are completed.");
	}

}
