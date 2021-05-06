package com.inhouse.leetcode;

public class ShortestDistToChar {

	public static void main(String[] args) {
		String str = "aaab";
		char c = 'b';
		int[] ans = shortestToChar(str, c);
		
		for(int num : ans) {
			System.out.print(num + " ");
		}

	}

	private static int[] shortestToChar(String str, char c) {
		int[] ans = new int[str.length()];
		int prev = -1;
		int left = 0;
		int right = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int index = str.indexOf(c, i);		

			if(str.charAt(i) == c)
				prev = index;
			
			if(prev < 0)
				left = Integer.MAX_VALUE;
			else
				left = Math.abs(prev - i);
			
			if(index < 0)
				right = Integer.MAX_VALUE;
			else
				right = Math.abs(index - i);
			
			ans[i] = Math.min(left, right);			
		}
		return ans;
	}
}
