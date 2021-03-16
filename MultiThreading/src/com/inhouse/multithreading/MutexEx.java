package com.inhouse.multithreading;

import java.util.ArrayList;
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
