package com.inhouse.leetcode;
// 226. Given the root of a binary tree, invert the tree, and return its root.
public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = null;
		TreeNode result = invertTree(root); 
	}

	private static TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		root.left = right;
		root.right = left;		
		return root;
	}

}
