package com.inhouse.multithreading;

public class ThreadStopEx {

	public static void main(String[] args) throws InterruptedException {
		Server myServer = new Server();
		
		Thread t1 = new Thread(myServer,"t1");
		System.out.println(t1.getState());  // NEW
		t1.start();
		
		System.out.println(Thread.currentThread().getName() + " is stopping Server thread...");
		Thread.sleep(1);
		myServer.stop();
		
		t1.join();

		System.out.println(t1.getState());
	}

}

class Server implements Runnable {
	private volatile boolean bExit = false;
	
	@Override
	public void run() {
		while(!bExit) {
			// RUNNABLE
			System.out.println("Server is running " + Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
		}
	}
	
	public void stop() {
		bExit = true;
	}
	
}
