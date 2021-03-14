package com.inhouse.exceptionhandling;

public class NestedTryEx {

	public static void main(String[] args) {
		try { // Parent try block
			
			try {
				System.out.println("Try block : 1");
				int num =33/0;
				System.out.println(num);// un-reachable code
			} catch(ArithmeticException e) {
				System.out.println("Exception block : 1 ,ArithmeticException");
			}
			
			try {
				System.out.println("Try block : 2");
				int b = 45/0; // throws ArithmeticException
				System.out.println(b);
			} catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception block : 2, ArrayIndexOutOfBoundsException");
			}
		} catch(Exception e) {
			System.out.println("Main Try block exception");
		}

	}

}
