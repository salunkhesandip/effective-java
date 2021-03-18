package com.inhouse.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticSyncEx {
	private static Random random = new Random();
	private static List<Integer> list1 = new ArrayList<Integer>();
	private static List<Integer> list2 = new ArrayList<Integer>();
	
	private synchronized static void stageOne() {
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	private synchronized static void stageTwo() {
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	
	public static void process() {
		for(int i=0;i<100;i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Runnable task1 = ()->{process();};
		Thread t1 = new Thread(task1);
		Runnable task2 = ()->{process();};
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken : " + (end-start));
		System.out.println("List1 size : " + list1.size() + " , List2 size : " + list2.size());
	}

}
