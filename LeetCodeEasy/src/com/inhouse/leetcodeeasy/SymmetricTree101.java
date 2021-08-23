package com.inhouse.leetcodeeasy;

import java.util.Stack;

/*
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree101 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		
		boolean result = isSymmetric(root);
		System.out.println(result);
	}

	private static boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}

	// Recursive approach
	private static boolean isMirror(TreeNode t1, TreeNode t2) {
		if(t1 == null & t2 == null) return true;
		if(t1 == null || t2 == null) return false;
		
		return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right,t2.left);
	}

	// Iterative approach
	private static boolean isSymmentricIterative(TreeNode root) {
		Stack<TreeNode> left = new Stack<TreeNode>();
		Stack<TreeNode> right = new Stack<TreeNode>();
		
		left.push(root.left);
		right.push(root.right);
		
		while(left.size() > 0) {
			TreeNode t1 = left.pop();
			TreeNode t2 = right.pop();
			
			if(t1 == null && t2 == null) continue;
			
			if(t1 != null && t2 != null && t1.val == t2.val) {
				left.push(t1.left);
				right.push(t2.right);
				
				left.push(t1.right);
				right.push(t2.left);
				continue;
			}
			return false;
		}
		return true;
	}
}
