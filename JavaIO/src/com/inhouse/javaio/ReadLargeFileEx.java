package com.inhouse.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Files.readLines(new File(path), Charsets.UTF_8) - Standard reading
 * all the file lines are kept in memory – which will quickly lead to OutOfMemoryError if the File is large enough.
 */

public class ReadLargeFileEx {

	public static void main(String[] args) throws IOException {
		String path = "C:/Sandip-Data/Study/java-repository/JavaIO/file.txt";
		FileInputStream inputStream = new FileInputStream(path);
		Scanner scanner = new Scanner(inputStream);
		
		try(inputStream;scanner){
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				
			}
		}

	}

}
