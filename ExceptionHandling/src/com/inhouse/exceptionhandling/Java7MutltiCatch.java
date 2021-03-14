package com.inhouse.exceptionhandling;

/*
 * An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
 */
public class Java7MutltiCatch {

	public static void main(String[] args) {
		try {
			rethrow("First");
		} catch(FirstException | SecondException e) {
			e.printStackTrace();
		}
		
		try {
			int arr[] = new int[5];
			arr[10] = 30/0;
			
			// RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
			// RuntimeException and its subclasses are unchecked exceptions. Unchecked exceptions do not need to be declared in a method 
			// or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			// If all the exceptions belong to the same class hierarchy, we should catching the base exception type. 
			// However, to catch each exception, it needs to be done separately in their own catch blocks
		}

	}

	static void rethrow(String str) throws FirstException, SecondException {
		try {
			if(str.equals("First"))
				throw new FirstException(str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	static class FirstException extends Exception {
		public FirstException(String msg) {
			super(msg);
		}
	}
	static class SecondException extends Exception {
		public SecondException(String msg) {
			super(msg);
		}
	}
}

