package com.inhouse.singleton;

public class ThreadSafeSingletonClient {

	public static void main(String[] args) {

			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
				}
				
			});
			
			
			Thread t2 = new Thread(new Runnable() {

				@Override
				public void run() {
					ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
				}
				
			});
			
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
