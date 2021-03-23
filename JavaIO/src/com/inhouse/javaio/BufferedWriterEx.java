package com.inhouse.javaio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedWriterEx {
/*
 * Before Java 7, the FileWriter + BufferedWriter combination is a standard solution for creating and writing characters or text to a file
 *  In Java 8, we can use Files.newBufferedWriter(path) to create a BufferedWriter.
 */
	public static void main(String[] args) throws IOException {
		// Java 8
		Path path = Paths.get("C:/Sandip-Data/Study/java-repository/JavaIO/BufferedWriterEx.txt");
		String content = "This is sample file writing program with BufferedWriter.";
		try(BufferedWriter bw = Files.newBufferedWriter(path)){
			bw.write(content);
			bw.newLine();
		}

	}

}
