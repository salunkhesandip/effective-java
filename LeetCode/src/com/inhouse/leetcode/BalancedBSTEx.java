package com.inhouse.leetcode;

class Node {
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
		left = right = null;
	}	
}

public class BalancedBSTEx {
	static Node root;
	
	Node sortedArrayToBST(int [] arr, int start, int end) {
		if(start > end)
			return null;
		
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);
		
		/* Recursively construct the left subtree and make it left child of root */
		node.left = sortedArrayToBST(arr, start, mid -1);
		node.right = sortedArrayToBST(arr, mid+1, end);
		
		return node;
	}
	
	void preOrder(Node node) {
		if(node == null) 
			return;
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String[] args) {
		BalancedBSTEx tree = new BalancedBSTEx();
		int [] arr = {1,2,3,4,5,6};
		int len = arr.length;
		
		root = tree.sortedArrayToBST(arr,0,len-1);
		System.out.println("Preorder traversal of constructed BST");
		tree.preOrder(root);
		System.out.println("#############");
		for(int i = 0; i< arr.length; i++)
			System.out.println(arr[i]);
	}
}
