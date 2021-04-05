package com.inhouse.leetcode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		for(int i = 0 ; i < nums.length ; i++)
			System.out.println(nums[i]);
		
		System.out.println("######################");
		int len = removeDuplicates(nums);
		System.out.println(len);
		for(int i = 0 ; i < len ; i++)
			System.out.println(nums[i]);
	}


	private static int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[j] != nums[i]) {
			i++;
			nums[i] = nums[j];
			}
			
		}
		return i + 1;
	}

}
