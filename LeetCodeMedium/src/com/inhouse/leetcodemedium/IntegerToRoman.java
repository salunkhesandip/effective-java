package com.inhouse.leetcodemedium;

/* 12. Integer to Roman
 * 
 */
public class IntegerToRoman {

	public static void main(String[] args) {
	int num = 6140;
	
	String roman = intToRoman(num);
	System.out.println(roman);
	}
/*
	private static String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();
		
		while(num > 0) {
			if(num >= 1000) {
				roman.append("M");
				num -= 1000;
			} else if(num >= 900) {
				roman.append("CM");
				num -= 900;
			} else if(num >= 500) {
				roman.append("D");
				num -= 500;
			} else if(num >= 400) {
				roman.append("CD");
				num -= 400;
			} else if(num >=100) {
				roman.append("C");
				num -= 100;
			} else if(num >= 90) {
				roman.append("XC");
				num -= 90;
			} else if(num >=50) {
				roman.append("L");
				num -= 50;
			} else if(num >= 40) {
				roman.append("XL");
				num -= 40;
			} else if(num >= 10) {
				roman.append("X");
				num -= 10;
			} else if(num >= 9) {
				roman.append("IX");
				num -= 9;
			} else if(num >=5) {
				roman.append("V");
				num -= 5;
			} else if(num >= 4) {
				roman.append("IV");
				num -= 4;
			} else if(num >= 1) {
				roman.append("I");
				num -= 1;
			}		
		}
		return roman.toString();
	}
	*/
	
	private static String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();
		String[] numerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		if(num > 3999 || num < 1) throw new IllegalArgumentException();
		int i = 0;
		
		while(num > 0) {
			if(num - values[i] >= 0) {
				roman.append(numerals[i]);
				num -= values[i];
			} else
				i++;
		}
		return roman.toString();
	}
}