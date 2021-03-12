package com.inhouse.generics;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	private BlockingQueue<Integer> shareQue;

	public Producer(BlockingQueue<Integer> shareQue) {
		super("Producer");
		this.shareQue = shareQue;
	}

	@Override
	public void run() {
		int i = 0;
		while(true){
			try {
				shareQue.put(i);
				System.out.println(getName() + " produced: " + i + ", Q size : " + shareQue.size());
				i++;
		
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
