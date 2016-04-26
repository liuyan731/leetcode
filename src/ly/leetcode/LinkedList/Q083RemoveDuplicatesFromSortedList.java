/*
 * Q083RemoveDuplicatesfromSortedList.java
 *
 *  Created on: 2016年4月22日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q083RemoveDuplicatesFromSortedList {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
//		ListNode node4 = new ListNode(8);
//		ListNode node5 = new ListNode(3);
//		ListNode node6 = new ListNode(6);
//		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node6;
//		node6.next = node7;
		
		deleteDuplicates(node1);
	}
	
	//这个只是去除了相邻是相同的节点（1->1->2->3->3）但是重复的点不相邻并不能消除（1->3->2->1->3）
	//链表为排序的，所以相同的节点一定是相邻的，在LeetCode上AC了
	public static ListNode deleteDuplicates(ListNode head) { 
		if(head == null || head.next == null) {
			return head;
		} else {
			ListNode p = head;
			ListNode q = p.next;
			while(p.next != null) {
				while(q != null) {
					if(p.val == q.val) {
						p.next = q.next;
						q = q.next;
					} else {
						p = p.next;
						q = q.next;
					}
				}
			}
			return head;
		}
	}
}
