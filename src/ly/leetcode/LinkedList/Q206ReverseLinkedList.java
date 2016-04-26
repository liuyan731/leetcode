/*
 * Q206ReverseLinkedList.java
 *
 *  Created on: 2016Äê4ÔÂ19ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q206ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		} else {
			ListNode p = head.next;
			head.next = null;
			ListNode q = null;
			while(p != null) {
				q = p;
				p = p.next;
				q.next = head;
				head = q;
			}
			return q;
		}
    }
	
	public ListNode reverseList2(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		} else {
			ListNode tmp = l1.next;
			l1.next = l2;
			return reverseList2(tmp, l1);
		}
	}
}
