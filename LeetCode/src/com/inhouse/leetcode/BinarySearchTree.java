package com.inhouse.leetcode;
/*
 * 108. Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */
public class BinarySearchTree {

	public static void main(String[] args) {
		int[] nums = {-10,-3,0,5,9};
		TreeNode root = sortedArrayToBST(nums);

	}

	private static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		return buildBST(nums,0,nums.length-1);
	}

	private static TreeNode buildBST(int[] nums, int start, int end) {
		if(start > end) return null;
		
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = buildBST(nums,start,mid-1);
		node.right = buildBST(nums,mid+1,end);
		return node;
	}

}
