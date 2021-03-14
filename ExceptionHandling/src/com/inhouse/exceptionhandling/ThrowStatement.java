package com.inhouse.exceptionhandling;

public class ThrowStatement {

	public static void main(String[] args) {
		System.out.println("Program starts here...");
		
		try {
			throw new InterruptedException("Demo");
			// Using throw keyword you can declare only one exception as a time.
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
