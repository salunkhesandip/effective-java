package com.inhouse.leetcode;

public class ReverseLetters {

	public static void main(String[] args) {
		String str = "ab-cd";
		//Output: "Qedo1ct-eeLg=ntse-T!"
		String output = reverseOnlyLetters(str);
		System.out.println(output);

	}
	private static String reverseOnlyLetters(String str) {
		StringBuilder ans = new StringBuilder();
		int j = str.length() - 1;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				while(!Character.isLetter(str.charAt(j))){
					j--;
				}
				ans.append(str.charAt(j--));
			} else {
				ans.append(str.charAt(i));
			}		
		}
		return ans.toString();
	}
/*
	private static String reverseOnlyLetters(String str) {
		int len = str.length();
		char [] rev = new char[len];
		char [] ans = new char[len];
		
		int k = 0;
		for(int i = len-1; i >= 0; i--) {
			if(isLetter(str.charAt(i))) {
				rev[k] = str.charAt(i);
				k++;
			}
		}
		
		int j = 0;
		for(int i = 0; i < len ;i++) {
			if(isLetter(str.charAt(i))) {
				ans[i] = rev[j];
				j++;
			} else 
				ans[i] = str.charAt(i);
			
		}
		
		String result = new String(ans);
		return result;
	}
	private static boolean isLetter(char ch) {
		int value = (int)ch;
		if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
			return true;
		}
		return false;
	}
*/
}
