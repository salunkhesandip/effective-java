package com.inhouse.leetcode;

/* 13. Roman to Integer
 * For example, 2 is written as II in Roman numeral, just two one's added together. 
 * 12 is written as XII, which is simply X + II. 
 * The number 27 is written as XXVII, which is XX + V + II.
	Roman numerals are usually written largest to smallest from left to right. 
	However, the numeral for four is not IIII. 
	Instead, the number four is written as IV. 
	Because the one is before the five we subtract it making four. 
	The same principle applies to the number nine, which is written as IX. 
	There are six instances where subtraction is used:
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	 * Symbol       Value
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
4 	-> IV
9 	-> IX
40 	-> XL
90 	-> XC
400 -> CD
900 -> CM
 */
public class RomanToIntegerEx {

	public static void main(String[] args) {
		String roman = "XM";
		int romanInt = romanToInt(roman);
		System.out.println(romanInt);
	}

	private static int romanToInt(String roman) {	
		int first = 0;
		int second = 1;
		int size = roman.length();
		int romanInt = 0;
		
		if(second == size)
			return  getIntVal(roman.charAt(first));  // Only one char
		
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
	}

}
