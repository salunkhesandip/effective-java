package com.inhouse.generics;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
	private BlockingQueue<Integer> shareQue;

	public Consumer(BlockingQueue<Integer> shareQue) {
		super("Consumer");
		this.shareQue = shareQue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Integer item = shareQue.take();
				System.out.println(getName() + " consumed: " + item + ", Q size : " + shareQue.size());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
