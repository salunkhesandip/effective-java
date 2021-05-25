package com.inhouse.leetcode;

public class DiameterBinaryTree {

	public static void main(String[] args) {
		TreeNode root = null;
		int diameter = diameterOfBinaryTree(root);

	}

	private static int diameterOfBinaryTree(TreeNode root) {
		int [] res = new int[1];
		res[0] = 0;
		process(root, res);
		return res[0];
	}

	private static int process(TreeNode node, int[] res) {
		if(node == null) return -1;
		
		int left = process(node.left, res) + 1;
		int right = process(node.right, res) + 1;
		res[0] = Math.max(res[0],left + right);
		return Math.max(left, right);
	}

}
