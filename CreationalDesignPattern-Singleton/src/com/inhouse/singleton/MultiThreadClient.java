package com.inhouse.singleton;

public class MultiThreadClient {

	public static void main(String[] args) {
		Runnable task1 = ()->{
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);};
		
		Runnable task2 = ()->{
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task1);
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
