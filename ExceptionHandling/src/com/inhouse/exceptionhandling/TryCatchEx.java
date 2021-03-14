package com.inhouse.exceptionhandling;

/*
 * A try block must be followed by catch blocks or finally block or both.
 * Generic exception handler catch block should be placed at the end 
 * otherwise will get compile time error - unreachable catch block
 * 
 */
public class TryCatchEx {

	public static void main(String[] args) {
		int num1,num2;
		
		try {
			num1 = 0;
			num2 = 12/num1;
			System.out.println(num1 + num2);
		} catch(ArithmeticException e) {
			System.out.println("Number divide by zero");
		} catch(Exception e) { 
			e.printStackTrace();
		}

		
		try {
			System.out.println("Only try won't be there, it has to have catch or finally block.");

		}
		// System.out.println("We can’t write any code between try-catch-finally block.");
		finally {
			System.out.println("always execute finally block");
			System.out.println("We can’t have catch or finally clause without a try statement.");
		}
		
	}

}
