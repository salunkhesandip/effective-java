package com.inhouse.leetcodeeasy;

import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum1 {

	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result);
	}
/*
// Time complicity O(n2)
	private static int[] twoSum(int[] nums, int target) {
		for(int i=0; i < nums.length; i++) {
			for(int j=i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target)
					return new int[] {i,j};
			}
		}
		throw new IllegalArgumentException("No two sum solution.");
	}
*/

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();		
		for(int i=0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No Two Sum Solution.");
	}	
}
