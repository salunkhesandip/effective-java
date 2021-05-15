package com.inhouse.generics;

class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}		
}

public class BinaryTreeTraversal {
	Node root;
	public BinaryTreeTraversal() {
		root = null;
	}
	
	void printInOrder(Node node) { //  Inorder (Left, Root, Right)
		if(node == null) return;
		printInOrder(node.left);
		System.out.print(node.key + " ");	
		printInOrder(node.right);			
	}
	
	void printPreOrder(Node node) { // Preorder (Root, Left, Right)
		if(node == null) return;
		System.out.print(node.key + " ");
		printPreOrder(node.left);	
		printPreOrder(node.right);			
	}
	
	void printPostOrder(Node node) { // Postorder (Left, Right, Root)
		if(node == null) return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");		
	}
	
	void printInOrder() {printInOrder(root);}
	void printPreOrder() {printPreOrder(root);}
	void printPostOrder() {printPostOrder(root);}
	
	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("############ printInOrder ############");
		tree.printInOrder();
		System.out.println();
		
		System.out.println("############ printPreOrder ############");
		tree.printPreOrder();
		System.out.println();
		
		System.out.println("############ printPostOrder ############");
		tree.printPostOrder();
		System.out.println();
	}

}
