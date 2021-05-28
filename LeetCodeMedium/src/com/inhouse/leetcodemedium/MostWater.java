package com.inhouse.leetcodemedium;

import java.util.HashMap;

/*
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two end points of the line i is at (i, ai) and (i, 0). 
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 */

public class MostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};

		int area = maxArea(height);
		System.out.println(area);
		
	}

	private static int maxArea(int[] height) {
		int left = 0, right = height.length - 1, maxArea = 0;
		
		while(left < right) {
			if(height[left] < height[right]) {
				maxArea = Math.max(maxArea,height[left] * (right - left));
				left++;
			}else {
				maxArea = Math.max(maxArea,height[right] * (right - left));
				right--;
			}
		}
		return maxArea;
	}

/*	private static int maxArea(int[] height) {
		HashMap<StringBuilder, Integer> map = new HashMap<StringBuilder, Integer>();
		int maxArea = 0;
		for(int i = 0; i < height.length; i++) {
			for(int j = i+1; j < height.length; j++) {
				if(i != j) {
					int x = Math.min(height[i], height[j]);
					int y = j - i;
					StringBuilder key = new StringBuilder(String.valueOf(x) +"," + String.valueOf(y));
					
					if(map.containsKey(key)) {
						maxArea = Math.max(maxArea, map.get(key));
					} else if(map.containsKey(key.reverse())) {
						maxArea = Math.max(maxArea, map.get(key.reverse()));
					} else {
						map.put(key, x*y);
						maxArea = Math.max(maxArea, x*y);
					}

				}
			}
		}
		
		return maxArea;
	}
*/
}
