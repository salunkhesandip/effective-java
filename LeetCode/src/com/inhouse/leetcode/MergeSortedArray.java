package com.inhouse.leetcode;
/*
 * 88. Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively.
 You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int n = 3;
		int[] nums2 = {2,5,6};
		merge(nums1, m, nums2, n);
		
		for(int d : nums1) {
			System.out.println(d);
		}

	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		
		for(int i = m + n + 1; i >=0; i--) {
			int a = m >=0 ? nums1[m] : Integer.MIN_VALUE;
			int b = n >=0 ? nums2[n] : Integer.MIN_VALUE;
			
			if(a > b) {
				nums1[i] = a;
				m--;
			} else
			{
				nums1[i] = b;
				n--;
			}
		}
		
	}
}
