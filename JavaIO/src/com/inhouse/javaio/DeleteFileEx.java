package com.inhouse.javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileEx {

	public static void main(String[] args) throws IOException {
		Files.createFile(Paths.get("C:/Sandip-Data/Study/java-repository/JavaIO/fileToDelete_jdk7.txt"));
		
		Path fileToDelete = Paths.get("C:/Sandip-Data/Study/java-repository/JavaIO/fileToDelete_jdk7.txt");
		Files.delete(fileToDelete);

	}

}
