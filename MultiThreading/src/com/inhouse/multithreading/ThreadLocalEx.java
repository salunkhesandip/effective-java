package com.inhouse.multithreading;
/*
 * The ThreadLocal variable allows you to store data in the execution context of each thread.
 * Thus each thread can have its own instance of data that can only be read and written by the same thread.
 */
class Task implements Runnable {
	final static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	@Override
	public void run() {
		threadLocal.set(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocal.get());
	}
	
}
public class ThreadLocalEx {

	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task,"FirstThread");
		Thread t2 = new Thread(task,"SecondThread");
		
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
