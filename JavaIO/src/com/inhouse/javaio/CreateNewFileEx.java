package com.inhouse.javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/*
 * Before Java 7, for writing bytes (image) to a file, we use FileOutputStream; 
 * for writing characters (text) to a file, we use FileWriter, and usually wrapped by a BufferedWriter to gain performance.
 * In Java 7, there is a new NIO class named java.nio.file.Files, and we can use Files.write() to write both bytes and characters.
 * In Java 8, we can use Files.newBufferedWriter(path) to create a BufferedWriter.
 * In Java 11, there is a new Files.writeString API to write string directly to a file.
 */
public class CreateNewFileEx {

	public static void main(String[] args) throws IOException {
		 String absoluteFilePath = "C:/Sandip-Data/Study/java-repository/JavaIO/file.txt";
		 File file = new File(absoluteFilePath);
		 
		 if(file.createNewFile()) {
			 System.out.println(absoluteFilePath + " file created.");
		 } else {
			 	System.out.println(absoluteFilePath + " file already exists.");
		 }
		 
		 String content = "Sample file writing program.";
		 try(FileWriter fw = new FileWriter(file);
			 BufferedWriter bw = new BufferedWriter(fw);){
			 bw.write(content);
			 bw.newLine();
		 }
		 
		 // java 7
		// file does not exist, create and write it , if the file exists, override the content 
		 Path path = Paths.get("C:/Sandip-Data/Study/java-repository/JavaIO/file.txt");
		 Files.write(path,content.getBytes(),StandardOpenOption.APPEND); // append mode
		
		 // java 11 write string directly to a file.
		 Files.writeString(path, content, StandardOpenOption.APPEND);
		 
		 List<String> vowelsList = Arrays.asList("a","e","i","o","u");
		 Files.write(path,vowelsList,StandardOpenOption.APPEND);
	}

}
