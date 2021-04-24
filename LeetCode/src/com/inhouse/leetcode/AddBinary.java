package com.inhouse.leetcode;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "101";
		
		String sum = addBinary(a, b); 
		System.out.println(sum);
	}

	private static String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int maxLen = Math.max(len1, len2);
		int carry = 0;
		String result ="";		

	
		for(int i = 0; i < maxLen ; i++) {
			int p = i < len1 ? a.charAt(len1 -1 - i) - '0' : 0; 
			int q = i < len2 ? b.charAt(len2 -1 - i) - '0' : 0; 
			int tmp = p + q + carry; 
			carry = tmp / 2; 
			result = tmp % 2 + result; 
			} 
		return (carry == 0) ? result : "1" + result;
	}
	/*      int i = a.length() - 1;
			int j = b.length() - 1;
			int sum = 0;
			String result = "";
			while(i >= 0 || j >= 0 || sum == 1) {
				sum += ((i >=0) ? a.charAt(i) - '0' : 0);
				sum += ((j >=0) ? b.charAt(j) - '0' : 0);
				result = (char)(sum%2 + '0') + result;
				sum /= 2;
				i--;
				j--;
			}
			return result;
	 * 
	 */
}
