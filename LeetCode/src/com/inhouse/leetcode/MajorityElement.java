package com.inhouse.leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,1,2,1};
		int element = majorityElement(nums);
		System.out.println(element);

	}
// Boyer–Moore majority vote algorithm
	private static int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = null;		
		for(int num : nums) {
			if(count == 0)
				candidate = num;	
			
			count += (candidate == num) ? 1 : -1;
		}
		return candidate;
	}

}
