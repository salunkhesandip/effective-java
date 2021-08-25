package com.inhouse.leetcodeeasy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthBinTree104 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		int height = maxDepth(root);
		System.out.println("Max Height of the Tree : " + height);
	}
/*	
	// Recursion -
	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
	}
*/
	// Iterative
	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		int height = 0;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(queue.size() > 0) {
			height++;
			int n = queue.size();
			
			for(int i = 0; i < n; i++) {
				TreeNode node = queue.remove();
				
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
		}
		return height;
	}
}
