package com.inhouse.leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 0;
		int index = searchInsert(nums, target);
		System.out.println(index);
	}

	private static int searchInsert(int[] nums, int target) {
		int i ;
		for(i = 0 ; i < nums.length; i++) {
			if(target <= nums[i]) {
				return i;
			}
		}
		return i;
	}
}
