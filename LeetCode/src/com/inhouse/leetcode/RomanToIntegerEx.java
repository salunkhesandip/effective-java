package com.inhouse.leetcode;

public class RomanToIntegerEx {

	public static void main(String[] args) {
		String roman = "D";
		int romanInt = romanToInt(roman);
		System.out.println(romanInt);
	}

	private static int romanToInt(String roman) {	
		int first = 0;
		int second = 1;
		int size = roman.length();
		int romanInt = 0;
		
		if(second == size)
			return  getIntVal(roman.charAt(first));
		
		while(second < size) {
			int val1 = getIntVal(roman.charAt(first));
			int val2 = getIntVal(roman.charAt(second));
			
			if(val1 > val2 ) {
				romanInt += val1;
				first++;
				second++;
			} else if(val1 < val2) {
				romanInt += (val2 - val1);
				first +=2;
				second +=2;
			} else if(val1 == val2) {
				romanInt += (val1 + val2);
				first +=2;
				second +=2;
			}
			
			if(first == (size -1)) {
				romanInt += getIntVal(roman.charAt(first));
			}
		}
		return romanInt;
	}

	private static int getIntVal(char c) {
		int value = 0;
		switch(c) {
		case 'I' :
			value = 1;
			break;
		case 'V' :
			value = 5;
			break;
		case 'X' :
			value = 10;
			break;
		case 'L' :
			value = 50;
			break;
		case 'C' :
			value = 100;
			break;
		case 'D' :
			value = 500;
			break;
		case 'M' :
			value = 1000;
		}
		return value;
		/*
		 * Symbol       Value
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
		 */
	}

}
