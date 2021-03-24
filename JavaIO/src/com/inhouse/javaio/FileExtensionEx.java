package com.inhouse.javaio;

import java.io.File;

public class FileExtensionEx {

	public static void main(String[] args) {
		File file = new File("C:/Sandip-Data/Study/java-repository/JavaIO/file.txt");
		
		String extension = getFileExtension(file);
		System.out.println("File extension : " + extension);

	}

	private static String getFileExtension(File file) {
		String fileName = file.getName();
		int index = fileName.lastIndexOf(".");
		if(index != -1) 
			return fileName.substring(index + 1);
		else 
			return "";
		
	}

}
