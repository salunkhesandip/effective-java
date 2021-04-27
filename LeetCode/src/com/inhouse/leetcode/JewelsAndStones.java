package com.inhouse.leetcode;

import java.util.HashMap;

public class JewelsAndStones {

	public static void main(String[] args) {
		String jewels = "aA", stones ="aAAbbbb";
		int num = numJewelsInStones(jewels, stones);		
		System.out.println(num);

	}

	private static int numJewelsInStones(String jewels, String stones) {
		int [] letters = new int[123];
		int cnt = 0;
		
		for(int i = 0; i < stones.length(); i++) {
			letters[stones.charAt(i)]++;
		}
		for(int j = 0 ; j < jewels.length();j++) {
			cnt += letters[jewels.charAt(j)];
		}
		return cnt;
	}

}
