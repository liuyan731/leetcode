/*
 * Q328OddEvenLinkedList.java
 *
 *  Created on: 2016Äê4ÔÂ21ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q328OddEvenLinkedList {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		oddEvenList(node1);
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		} else {
			ListNode odd = head;
			ListNode even = head.next;
			ListNode evenHead =  head.next;
			while(even != null && even.next != null) {
				odd.next = even.next;
				odd = odd.next;
				even.next = odd.next;
				even = even.next;
			}
			odd.next = evenHead;
			return head;
		}
	}
}
