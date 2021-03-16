package com.inhouse.multithreading;

import java.util.concurrent.Semaphore;

public class DbConnection {
	private static DbConnection instance = new DbConnection();
	private int connections = 0;
	private Semaphore semaphore = new Semaphore(5);
	
	public static DbConnection getInstance() {
		return instance;
	}
	
	public void connect() {
		try {
			semaphore.acquire();

			synchronized(this) {
				connections++;
				System.out.println("Current number of connections : " + connections);
			}
		
			Thread.sleep(5000);
			
			synchronized(this) {
				connections--;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

	

	
}
