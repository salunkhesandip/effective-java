package com.inhouse.leetcode;

import java.util.Stack;

public class FlowerBed {

	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,0,1};
		int n = 2;
		boolean result = canPlaceFlowers(flowerbed, n);
		System.out.println(result);
	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int cnt = 0;
		int prev = 0;
		for(int i = 0 ; i < flowerbed.length; i++) {
			int cur = flowerbed[i];
			
			if(cur == 0) {
				if(prev == 0) {
					prev = 1;
					cnt++;
				} else
					prev = 0;

			} else if(cur == 1) {
				if(prev == 1)				
					cnt--;
				else
					prev = 1;
			}
		}
		return cnt >= n ?true : false;
	}

}
