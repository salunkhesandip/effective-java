package com.inhouse.multithreading;
import java.util.ArrayList;

/*
 * In a multithreaded application, two or more threads may need to access a shared resource at the same time, resulting in unexpected behavior.
 * We call this scenario a race condition. And, the part of the program which accesses the shared resource is known as the critical section. 
 * So, to avoid a race condition, we need to synchronize access to the critical section.
 * A mutex (or mutual exclusion) is the simplest type of synchronizer – 
 * it ensures that only one thread can execute the critical section of a computer program at a time.
 * To access a critical section, a thread acquires the mutex, then accesses the critical section, and finally releases the mutex. 
 * In the meantime, all other threads block till the mutex releases. 
 * As soon as a thread exits the critical section, another thread can enter the critical section.
 */

import java.util.List;
import java.util.Random;

public class MutexEx implements Runnable {
	private int count;
	private final Object mutex = new Object();
	
	public int getCount() {
		return count;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(mutex) {
			count++;
		}
	}
	
	public static void main(String[] args) {
		MutexEx counter = new MutexEx();
		List<Thread> threads = new ArrayList<>();

		for(int i=0;i<100;i++) {
			Thread t= new Thread(counter);
			threads.add(t);
			t.start();
		}
		
		for(Thread t: threads) {
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println("Final thread count : " + counter.getCount());
	}



}
