package com.inhouse.multithreading;

public class ProcessorEx {

	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer running");
			wait();
			// this forces the current thread to wait until some other thread invokes notify() 
			// or notifyAll() on the same object. 
			System.out.println("Producer resumed");
		}
	}
	
	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		synchronized(this) {
			System.out.println("Consumer running");
			notify();
//  notify() method is used for waking up threads that are waiting for an access to this object's monitor.
			System.out.println("after notify");
		}
	}
}
