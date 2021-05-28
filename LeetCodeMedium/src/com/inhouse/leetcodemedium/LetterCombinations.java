package com.inhouse.leetcodemedium;

import java.util.ArrayList;
import java.util.List;

/*
 * 17. Letter Combinations of a Phone Number
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
 * Return the answer in any order. A mapping of digit to letters (just like on the telephone buttons) is given below. 
 * Note that 1 does not map to any letter.
 */
public class LetterCombinations {

	public static void main(String[] args) {
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println(result);
	}
	
	private static List<String> letterCombinations(String digits) {
		List<String> answer = new ArrayList<String>();
		char[] letter1 = (digits.length() > 0 )? getLetters(digits.charAt(0)) : new char[]{};
		char[] letter2 = (digits.length() > 1 )? getLetters(digits.charAt(1)) : new char[]{};
		char[] letter3 = (digits.length() > 2 )? getLetters(digits.charAt(2)) : new char[]{};
		char[] letter4 = (digits.length() > 3 )? getLetters(digits.charAt(3)) : new char[]{};
		
		if(digits.length() == 0) return answer;
		
		if(digits.length() == 1) {
			for(int a = 0; a < letter1.length; a++)
				answer.add(Character.toString(letter1[a]));
		} else if(digits.length() == 2) {
			for(int a = 0; a < letter1.length; a++) {
				for(int b = 0; b < letter2.length; b++) {
					StringBuilder pattern = new StringBuilder().append(letter1[a]).append(letter2[b]);
					answer.add(pattern.toString());
				}
			}
		} else if(digits.length() == 3) {
			for(int a = 0; a < letter1.length; a++) {
				for(int b = 0; b < letter2.length; b++) {
					for(int c = 0; c < letter3.length; c++) {
						StringBuilder pattern = new StringBuilder().append(letter1[a]).append(letter2[b]).append(letter3[c]);
						answer.add(pattern.toString());
						}
					}
				}
		} else {
			for(int a = 0; a < letter1.length; a++) {
				for(int b = 0; b < letter2.length; b++) {
					for(int c = 0; c < letter3.length; c++) {
						for(int d = 0; d < letter4.length; d++) {
							StringBuilder pattern = new StringBuilder().append(letter1[a]).append(letter2[b]).append(letter3[c]).append(letter4[d]);
							answer.add(pattern.toString());
						}

					}
				}
			}
		}
		return answer;
	}
	
	private static char[] getLetters(char ch) {
		char[] chArr = null;
		switch(ch){
		case '2' :
			chArr = new char[]{'a', 'b', 'c'};
			break;
		case '3' :
			chArr = new char[]{'d', 'e', 'f'};
			break;
		case '4' :
			chArr = new char[]{'g', 'h', 'i'};
			break;
		case '5' :
			chArr = new char[]{'j', 'k', 'l'};
			break;
		case '6' :
			chArr = new char[]{'m', 'n', 'o'};
			break;
		case '7' :
			chArr = new char[]{'p', 'q', 'r','s'};
			break;
		case '8' :
			chArr = new char[]{'t', 'u', 'v'};
			break;
		case '9' :
			chArr = new char[]{'w', 'x', 'y','z'};
			break;
		}
		return chArr;
	}
}
