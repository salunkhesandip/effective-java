package com.inhouse.generics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/*
 * Both are blocking methods, which means put() will block if the queue has reached its capacity and 
 * there is no place to add a new element. 
 * Similarly, the take() method will block if the blocking queue is empty.
 */
public class BlockingQueuePC {

	public static void main(String[] args) {
	BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>(10);
	
	Producer p = new Producer(sharedQ);
	Consumer c = new Consumer(sharedQ);
	
	p.start();
	c.start();
	}

}
