package com.inhouse.multithreading;

import java.util.Scanner;

/*
 * Any variable which is shared between multiple threads should be made variable, 
 * in order to ensure that all thread must see the latest value of the volatile variable.
 */

class Processor extends Thread {
	private static volatile boolean running = true;
	
	@Override
	public void run() {
		while(running) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown() {
		running = false;
	}	
}

public class VolatileEx {
	public static void main(String[] args) throws InterruptedException {
		Processor proc1 = new Processor();
		proc1.start();
		System.out.println("Press return key to stop.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		proc1.shutDown();
	}
}
