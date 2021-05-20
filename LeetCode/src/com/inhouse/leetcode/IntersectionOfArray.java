package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* 350. Intersection of Two Arrays II
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] answer = intersect(nums1,nums2);
		for(int d : answer)
			System.out.println(d);

	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int min = Math.max(len1, len2);
		int[] answer;
				
		if(min == len1) 
			answer = buildArray(len1, len2,nums1,nums2);
		else
			answer = buildArray(len2, len1,nums2,nums1);		

		return answer;
	}
	
	private static int[] buildArray(int min, int max,int minArr[],int maxArr[]) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int cnt = 0;
		return null;
	}
	
}