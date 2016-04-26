/*
 * Q203RemoveLinkedListElements.java
 *
 *  Created on: 2016年4月20日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q203RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(5);
		ListNode node7 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;

		removeElements(node1, 6);
	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		} else {
			ListNode node = new ListNode(-1);
			node.next = head;
			ListNode p = node; // 前后两个指针
			ListNode q = head; 
			while (q != null) {
				if (q.val == val) {	//删除当前节点
					q = q.next;
					p.next = q;
				} else {
					p = p.next;	//两个指针同时往后移
					q = q.next;
				}
			}
			return node.next;
		}
	}
}
