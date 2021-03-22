package com.inhouse.multithreading;

/*
 * User threads are high-priority threads. 
 * The JVM will wait for any user thread to complete its task before terminating it.
 * Daemon threads are low-priority threads whose only role is to provide services to user threads.
 * Daemon threads are useful for background supporting tasks such as garbage collection, releasing memory of unused objects and removing unwanted entries from the cache. 
 * Most of the JVM threads are daemon threads.
 */
public class DaemonThreadEx extends Thread {

	public void run() {
		System.out.println("isDaemon : " + Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) throws InterruptedException {
		DaemonThreadEx daemonThread = new DaemonThreadEx();
		daemonThread.setDaemon(true);
		daemonThread.start(); 
		// An attempt to call setDaemon() while a thread is running will throw an IllegalThreadStateException:
		
		daemonThread.join();
	}

}
