package com.inhouse.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Java 7 – allows us to declare resources to be used in a try block with the assurance that
 * the resources will be closed when after the execution of that block
 */
public class TryWithResourcesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(Scanner scanner = new Scanner(new File("test.txt"))) {
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

//As of Java 9 we can now use final or even effectively final variables inside a try-with-resources  block.

		testARMJava9();
		}

	private static void testARMJava9() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		try(br){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		
	}
}
