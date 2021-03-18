package com.inhouse.multithreading;
/*
 * The synchronized keyword can be used on different levels: 
 * Instance methods, Static methods, Code blocks
 * When we use a synchronized block, internally Java uses a monitor also known as monitor lock or 
 * intrinsic lock, to provide synchronization. These monitors are bound to an object, 
 * thus all synchronized blocks of the same object can have only one thread executing them at the same time.
 */
public class SynchronizedKeyword {
	private int count = 0;
	public static void main(String[] args) throws InterruptedException {
		SynchronizedKeyword app = new SynchronizedKeyword();
		app.doSomeWork();
	}

	private void doSomeWork() throws InterruptedException {
		Runnable task1 = ()->{for(int i=0;i<10000;i++) {increment();}};
		Runnable task2 = ()->{for(int i=0;i<10000;i++) {increment();}};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Count : " + count);
	}

	// only one thread per instance of the class can execute this method.
	// The lock behind the synchronized methods and blocks is reentrant. 
	// That is, the current thread can acquire the same synchronized lock over and over again while holding it.
	private synchronized void  increment() {
		count++;
	}
	// The code is said to be synchronized on the monitor object.

}
