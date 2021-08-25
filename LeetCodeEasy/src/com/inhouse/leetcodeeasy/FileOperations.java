package com.inhouse.leetcodeeasy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		String path ="C:\\Sandip-Data\\Study\\java-repository\\LeetCodeEasy\\src\\com\\inhouse\\leetcodeeasy\\file.txt";
		File file = new File(path);
		
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		String content = "Sample text file.";
		FileWriter fw = new FileWriter(file,true); // append mode
		BufferedWriter bw = new BufferedWriter(fw);
		try(fw;bw){
			bw.write(content);
			bw.newLine();
		}
		
		System.out.println("file.seperator : " + file.separator);
		System.out.println("file.separatorChar : " + file.separatorChar);
		System.out.println("file.pathSeparator : " + file.pathSeparator);
		System.out.println("file size : " + file.length());
		
		/*if(file.delete()) {
			System.out.println("file deleted");
		}*/
	}
	
}
