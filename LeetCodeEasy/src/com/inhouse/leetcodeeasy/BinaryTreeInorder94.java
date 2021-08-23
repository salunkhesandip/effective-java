package com.inhouse.leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder94 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		
		List<Integer> result = inorderTraversal(root);
		System.out.println(result);
	}
// InOrder - Left-Root-Right
// PreOrder - Root-Left-Right
// PostOrder - Left-Right-Root
	
	private static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		
		if(root == null) return new ArrayList<Integer>();
		
		result.addAll(inorderTraversal(root.left));
		result.add(root.val);
		result.addAll(inorderTraversal(root.right));
		
		return result;
	}
}
