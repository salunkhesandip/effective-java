package com.inhouse.leetcodemedium;

import java.util.Arrays;
import java.util.HashMap;

/* 454. 4Sum II
 * Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 */
public class FourSum {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {-2,-1};
		int[] nums3 = {-1,2};
		int[] nums4 = {0,2};
		int result = fourSumCount(nums1, nums2, nums3, nums4);
		System.out.println(result);
	}

	private static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Arrays.sort(nums3);
		Arrays.sort(nums4);
		int count = 0;
		HashMap<Integer,Integer> oneTwoSum = new HashMap<Integer,Integer>();
		
		for(int a : nums1) {
			for(int b : nums2) {
			int sum = a + b;			
			oneTwoSum.put(sum, oneTwoSum.getOrDefault(sum, 0) + 1);
			}
		}
		
		for(int c : nums3) {
			for(int d : nums4) {
				int sum = c + d;
				count +=  oneTwoSum.getOrDefault(-sum, 0);
			}
		}
		return count;
	}
}
