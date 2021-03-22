package com.inhouse.multithreading;

public class WaitAndNotifyEx {

	public static void main(String[] args) {
		final ProcessorEx processor = new ProcessorEx();
		
		Runnable task1 = ()->{try {
			processor.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}};

		Runnable task2 = ()->{try {
			processor.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
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
