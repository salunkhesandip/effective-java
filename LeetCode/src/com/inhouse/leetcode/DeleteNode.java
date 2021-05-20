package com.inhouse.leetcode;
// 237. Delete Node in a Linked List
public class DeleteNode {

	public static void main(String[] args) {
		ListNode node = null;
		deleteNode(node);

	}

	private static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node = node.next.next;
	}

}
