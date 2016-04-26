/*
 * Q019RemoveNthNodeFromEndOfList.java
 *
 *  Created on: 2016年4月22日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q019RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return null;
		}

		ListNode p = head;
		int len = 0;
		while (p != null) {
			p = p.next;
			len += 1;
		}
		int idx = len - n + 1;
		ListNode q = head;
		int idxTmp = 0;
		
		if(idx == 1) {
			ListNode node = new ListNode(-1);
			node.next = head;
			node.next = node.next.next;
			return node.next;
		}
		
		while (q.next != null) {
			idxTmp += 1;
			if (idxTmp == idx - 1) {
				q.next = q.next.next;
				break;
			}
			q = q.next;
		}
		return head;
	}

	//快慢指针的路程差问题
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode fast = newHead;
		ListNode slow = newHead;
		while(fast.next != null) {
			if(n <= 0) {
				slow = slow.next;
			}
			fast = fast.next;
			n--;
		}
		if(slow.next != null) {
			slow.next = slow.next.next;
		}
		return newHead.next;
	}
}
