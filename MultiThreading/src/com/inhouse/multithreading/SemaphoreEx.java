package com.inhouse.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
	static Semaphore semaphore = new Semaphore(4);
	static class MyATM extends Thread {
		String name;
		public MyATM(String name) {
			super();
			this.name = name;
		}
		@Override
		public void run() {
			try {
				System.out.println(name + " available permits  : " + semaphore.availablePermits() + ", before acquiring a lock");
				semaphore.acquire();
				System.out.println(name + " available permits now : " + semaphore.availablePermits() + ", acquired a lock");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphore.release();
				System.out.println(name + " available permits after finally: " + semaphore.availablePermits() + ", releasing lock.");
			}
		}

	}
	public static void main(String[] args) {
		System.out.println("Total available permits : " + semaphore.availablePermits());
		MyATM t1 = new MyATM("A");
		MyATM t2 = new MyATM("B");
		MyATM t3 = new MyATM("C");
		MyATM t4 = new MyATM("D");
		MyATM t5 = new MyATM("E");
		MyATM t6 = new MyATM("F");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
