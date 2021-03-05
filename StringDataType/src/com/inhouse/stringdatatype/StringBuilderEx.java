package com.inhouse.stringdatatype;

public class StringBuilderEx {

	public static void main(String[] args) {
		String s1 = "Hello";
		concat1(s1); // String is immutable 
		System.out.println("s1 in main : " + s1);
		
		StringBuilder sb = new StringBuilder("Hello");
		concat2(sb); // sb is mutable
		System.out.println("sb in main : " + sb);
		
		StringBuffer sbr = new StringBuffer("Hello");
		concat3(sbr); // StringBuffer is mutable and thread-safe
		System.out.println("sbr in main : " + sbr);

	}

	private static void concat3(StringBuffer sbr) {
		sbr.append("World");
		System.out.println("sbr in concat : " + sbr);
		
	}

	private static void concat2(StringBuilder sb) {
		sb = sb.append("World");
		System.out.println("sb in concat : " + sb);
	}

	private static void concat1(String s1) {
		s1 = s1 + "World";
		System.out.println("s1 in concat : " + s1);
	}

}
