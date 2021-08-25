package com.inhouse.leetcodeeasy;

public class BinarySearchTree108 {

	public static void main(String[] args) {
		int [] nums = {-10,-3,0,5,9};		
		TreeNode node = sortedArrayToBST(nums);

	}

	private static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		
		return buildBST(nums,0,nums.length -1);
	}

	private static TreeNode buildBST(int[] nums, int start, int end) {
		if(start > end) return null;
		
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = buildBST(nums, 0, mid-1);
		root.left = buildBST(nums, mid+1, end);
		return root;
	}
}
