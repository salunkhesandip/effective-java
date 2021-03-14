package com.inhouse.exceptionhandling;
/*
 * Java does not verify unchecked exceptions at compile-time.
 * Some common unchecked exceptions in Java are NullPointerException,
 * ArrayIndexOutOfBoundsException, and IllegalArgumentException.
 * 
 * The RuntimeException class is the superclass of all unchecked exceptions.
 * If a client can reasonably be expected to recover from an exception, make it a checked exception. 
 * If a client cannot do anything to recover from the exception, make it an unchecked exception.
 */
public class UnCheckedExceptionEx {

	public static void main(String[] args) {
		int numerator = 13;
		int denominator = 0;
		int result = numerator/denominator; // throws ArithmeticException at run-time.
		System.out.println(result);

	}

}
