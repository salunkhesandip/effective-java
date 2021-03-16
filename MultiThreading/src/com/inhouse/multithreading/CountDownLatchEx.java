package com.inhouse.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchEx {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		// CountDownLatch is a synchronization aid that allows one or more threads to wait until a 
		// set of operations being performed in other thread's completes.
		
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for(int i=0;i<3;i++)
				executor.submit(new LatchProcessor(latch));
		
		//executor.shutdown();
		// Initiates an orderly shutdown in which previously submitted tasks are executed, 
		// but no new tasks will be accepted
		try {
			//executor.awaitTermination(1, TimeUnit.DAYS);
			latch.await();
			// Causes the current thread to wait until the latch has counted down to zero, 
			// unless the thread is interrupted. 

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread is finished.");
	}

}

class LatchProcessor implements Runnable{
	private CountDownLatch latch;
	public LatchProcessor(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Started : " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown(); 
		// Decrements the count of the latch, releasing all waiting threads if the count reaches zero.
	}
	
}
