package com.inhouse.javaio;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class FileSeparator {
	public static void main(String[] args) {
		File file;
		Properties property = System.getProperties();
		String osName = property.getProperty("os.name");
		System.out.println(osName);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}

}
