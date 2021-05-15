package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.List;
// 94. Given the root of a binary tree, return the inorder traversal of its nodes' values.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
		}
	}

public class BTreeInorder {
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
	
		List<Integer> result = inorderTraversal(root);
	}

	private static List<Integer> inorderTraversal(TreeNode root) {
		// Inorder (Left, Root, Right)
        List<Integer> result = new ArrayList<Integer>();
		if(root == null) return new ArrayList<Integer>();
		result.addAll(inorderTraversal(root.left));
        result.add(root.val);
		result.addAll(inorderTraversal(root.right));
		return result;
	}

}
