package com.inhouse.multithreading;

public class ProcessorEx {

	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer running");
			// can only be called from a synchronized block. 
			// It releases the lock on the object so that another thread can jump in and acquire a lock.
			wait();
			// this forces the current thread to wait until some other thread invokes notify() 
			// or notifyAll() on the same object. 
			System.out.println("Producer resumed");
		}
	}
	
	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		// Thread.sleep() pauses the current thread and does not release any locks.
		synchronized(this) {
			System.out.println("Consumer running");
			notify();
//  notify() method is used for waking up threads that are waiting for an access to this object's monitor.
			System.out.println("after notify");
		}
	}
}
