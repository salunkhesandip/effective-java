package com.inhouse.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsMethodSign {

	public static void main(String[] args) {
		System.out.println("Program starts here...");
		try {
			doSomeWork();
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

	private static void doSomeWork() throws InterruptedException,  ArithmeticException  {
		Thread.sleep(100);
		int num1 = 42/0;
		System.out.println(num1);
		
	}

}
