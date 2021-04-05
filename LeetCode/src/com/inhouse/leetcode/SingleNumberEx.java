package com.inhouse.leetcode;

public class SingleNumberEx {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2,4,3,0,3};
		int result = singleNumber(nums);
		
		System.out.println(result);
	}
	/*
	 * If we take XOR of zero and some bit, it will return that bit
	 * If we take XOR of two same bits, it will return 0
	 * So we can XOR all bits together to find the unique number.
	 */
	private static int singleNumber(int[] nums) {	
		int a = 0;
		for(int i : nums) {
			a ^= i;
		}
		return a;
	}
/*
	private static int singleNumber(int[] nums) {		
		int i;
		for(i = 0; i < nums.length; i++) {
			boolean found = false;
			for(int j = 0; j < nums.length; j++) {
				if(i == j ) {
					continue;
				}
				if(nums[i] == nums[j]) {
					found = true;
					break;
				}				
			}
			if(found == false) {
				break;
			}
		}
		return nums[i];
	}
*/
	
}
