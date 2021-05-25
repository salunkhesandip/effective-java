package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 350. Intersection of Two Arrays II
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,3,3};
		int[] nums2 = {1,2,3,4};
		int[] answer = intersect(nums1,nums2);
		for(int d : answer)
			System.out.println(d);

	}
/*
	private static int[] intersect(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int minLen = Math.min(len1, len2);
		int[] answer;
				
		if(minLen == len1) 
			answer = buildArray(len1, len2,nums1,nums2);
		else
			answer = buildArray(len2, len1,nums2,nums1);		

		return answer;
	}
	
	private static int[] buildArray(int minLen, int maxLen, int minArr[], int maxArr[]) {
		Arrays.sort(minArr);
		Arrays.sort(maxArr);
		List<Integer> intersect = new ArrayList<>();
		int i = 0,j = 0;
		while(i < minLen && j < maxLen) {
			if(minArr[i] == maxArr[j]) {
				intersect.add(minArr[i]);
				i++;
				j++;
			} else if(minArr[i] < maxArr[j]) {
				i++;			
			} else {
				j++;
			}
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
*/
	// Time : O(m+n)
	// Space : O(min(m,n))
	private static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length > nums2.length)
			return intersect(nums2, nums1);

		HashMap<Integer,Integer> map = new HashMap();
		List<Integer> list = new ArrayList();
		
		for(int num : nums1)
			map.put(num, map.getOrDefault(num, 0) + 1);
		
		for(int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if(count > 0) {
				list.add(num);
				map.put(num,count - 1);
			}
		}
		
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;		
	}
}