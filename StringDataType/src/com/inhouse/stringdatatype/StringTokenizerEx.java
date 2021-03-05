package com.inhouse.stringdatatype;

import java.util.StringTokenizer;
/*
 * The StringTokenizer doesn't support regular expression, while spilt() does.
 * The String.split() method returns an array (String[]) and 
 * Tokenizer returns one token at a time.


 */
public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		String result[] = "this is a test".split("\\s");
		for(String str : result) {
			System.out.println(str);
		}
	}

}
