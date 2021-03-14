package com.inhouse.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Checked exceptions are subject to the Catch or Specify Requirement. 
 * All exceptions are checked exceptions, except for those indicated by Error, RuntimeException, and their subclasses.
 * 
 * Errors are not subject to the Catch or Specify Requirement. 
 * Errors are those exceptions indicated by Error and its subclasses.
 * 
 * Runtime exceptions are not subject to the Catch or Specify Requirement. 
 * Runtime exceptions are those indicated by RuntimeException and its subclasses.
 * 
 * Errors and runtime exceptions are collectively known as unchecked exceptions.
 */
public class CheckedExceptionEx {

	private static BufferedReader br;

	public static void main(String[] args) {
		// java.lang.Error: Unresolved compilation problems
		FileReader fr;
		try {
			fr = new FileReader("ExceptionTest.txt");
			br = new BufferedReader(fr);
			System.out.println(br.readLine());

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
