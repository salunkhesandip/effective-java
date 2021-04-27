package com.inhouse.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,3};
		boolean result = containsDuplicate(nums); 
		System.out.println(result);
	}

	private static boolean containsDuplicate(int[] nums) {
		int len = nums.length;
		Set<Integer> set = new HashSet<>(len);
		set.add(nums[0]);
		for(int i = 1; i < len; i++) {
			int num = nums[i];
			if(set.contains(num))
				return true;
		            
			set.add(num);
			}
		return false;
	}
	/*
	private boolean containsDuplicate(int[] nums) {
	    Arrays.sort(nums); // heapsort is known to provide O(n \log n)O(nlogn) worst-case performance,
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	} */
}
