package com.inhouse.leetcodemedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 15. 3Sum
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result);

	}

	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 2; i++) {
			if(i == 0 || (i > 0 && nums[i] != nums[i -1])) {
				int low = i+1;
				int high = nums.length - 1;
				
				while(low < high) {
					int sum = nums[i] + nums[low] + nums[high];
			 		if(sum == 0) {
						output.add(Arrays.asList(nums[i],nums[low],nums[high]));
						while(low < high && nums[low] == nums[low+1]) low++;
						while(low < high && nums[high] == nums[high-1]) high--;
						
						low++;
						high--;						
					} else if(sum > 0)
						high--;
					else
						low++;
				}
			}			
		}
		return output;
	}
/*
	private static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			for(int j = i+1; j < nums.length;j++) {
				for(int k = j+1; k < nums.length;k++) {
					if(i != j && i != k && j != k) {
						if(nums[i] + nums[j] + nums[k] == 0) {
							Arrays.asList(nums[i],nums[j],nums[k]);
							resultSet.add(Arrays.asList(nums[i],nums[j],nums[k]));
						}			
					}
				}
			}			
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>(resultSet);
		return result;
	}
*/
	
}
