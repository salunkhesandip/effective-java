package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array nums of n integers where nums[i] is in the range [1, n], 
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class FindMissing {

	public static void main(String[] args) {
		int[] nums = {1,1};
		List<Integer> result = findDisappearedNumbers(nums);
		System.out.println(result);
		
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		int len = nums.length;
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < len; i++) {
			int val = Math.abs(nums[i]) - 1;
			if(nums[val] > 0)
				nums[val] = -nums[val];
		}
		
		for(int i = 0; i < len; i++) {
			if(nums[i] > 0) {
				result.add(i+1);
			}
		}

		return result;
	}

}
