package com.inhouse.leetcodeeasy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AsciiEncoder {

	public static void main(String[] args) {
		String inputStr = "Ascii encoder!";
		StringBuilder input = new StringBuilder(inputStr);
		System.out.println("Input String : " + input);
		String rev = input.reverse().toString();
		StringBuilder encStr = new StringBuilder();
		StringBuilder decStr = new StringBuilder();
		System.out.println(rev);
		for(int i = 0; i < rev.length();i++) {
			System.out.print(rev.charAt(i) + " ");

			
		}
		System.out.println();
		for(int i = 0; i < rev.length();i++) {
			int ascii = rev.charAt(i);
			System.out.print(ascii + " ");
			encStr.append(ascii).append(" ");			
		}
		
		System.out.println();
		
		System.out.println(encStr);
		StringTokenizer st = new StringTokenizer(encStr.toString());
		
		System.out.println("Decode");
		while(st.hasMoreTokens()) {
			char ch = (char)Integer.parseInt(st.nextToken());
			decStr.append(ch);
		}
		decStr.reverse();
		System.out.println("Decoded String : " + decStr.toString());
		
		HashMap<String,ArrayList<StringBuilder>> map = new HashMap<>();
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		System.out.println("formatted date : " + dtf.format(dateTime));
		
		if(!map.containsKey(inputStr)){
			ArrayList<StringBuilder> sbArr = new ArrayList<StringBuilder>();
			StringBuilder value = new StringBuilder("1=");
			value.append(dtf.format(dateTime));
			
			sbArr.add(value);
			map.put(inputStr,sbArr);
		} else
		{
			ArrayList<StringBuilder> sbArr = map.get(inputStr);
			int lastIndex = sbArr.size() -1;
			StringBuilder lastVal = sbArr.get(lastIndex);						
		}
		System.out.println(map);
	}


}
