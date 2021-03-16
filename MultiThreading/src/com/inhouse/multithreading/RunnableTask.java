package com.inhouse.multithreading;

public class RunnableTask implements Runnable {
	private int id;
	
	public RunnableTask(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		try {
			System.out.println("Starting : " + Thread.currentThread().getName() + ", id :" + id);
			Thread.sleep(5000);
			System.out.println("Finishing : " + Thread.currentThread().getName() + ", id :" + id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
