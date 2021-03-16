package com.inhouse.multithreading;

public class ThreadCreationEx extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadCreationEx t1 = new ThreadCreationEx();
		t1.setName("thread-1");
		ThreadCreationEx t2 = new ThreadCreationEx();
		t2.setName("thread-2");
		
		t1.start();
		t2.start();
	}

}
