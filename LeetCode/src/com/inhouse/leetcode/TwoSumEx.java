package com.inhouse.leetcode;
import java.util.HashMap;
import java.util.Map;

public class TwoSumEx {

	public static void main(String[] args) {
		int[] nums = {0,1,5,6,7,9,10};
		int target = 15;
		int[] result = twoSum(nums, target);
		System.out.println("[" + result[0]+"," + result[1] + "]");
		result = twoSumByMap(nums, target);
		System.out.println("[" + result[0]+"," + result[1] + "]");
	}

	// Time complexity : O(n)O(n). We traverse the list containing nn elements only once. 
	// Each look up in the table costs only O(1)O(1) time.
	private static int[] twoSumByMap(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length;i++) {
			int complement = target - nums[i];
			
			if(map.containsKey(complement))
				return new int[] {map.get(complement),i};
			
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	// brute force approach 
	private static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length;i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if((nums[i] + nums[j]) == target)
				{
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
