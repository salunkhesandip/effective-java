package com.inhouse.leetcode;

/*
 * 104. Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaxDepthBTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		
		root.left = left;
		root.right = right;
		
		right.left = new TreeNode(15);
		right.right = new TreeNode(7);
		
		int height = maxDepth(root);
		System.out.println(height);
	}

	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
	}
}
