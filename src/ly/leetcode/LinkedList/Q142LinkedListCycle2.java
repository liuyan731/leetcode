/*
 * Q142LinkedListCycle2.java
 *
 *  Created on: 2016年4月22日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q142LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) {
			return null;
		} else {
			ListNode fast = head;
			ListNode slow = head;
			while(fast != null) {
				fast = fast.next;
				slow = slow.next;
				
				if(fast == null) {
					return null;
				}
				fast = fast.next;
				
				if(fast == slow) {	// 存在环了，环是fast/slow
//					解法一
//					ListNode node = head;
//					while(node != null) {
//						ListNode slowTmp = slow;
//						while(slow != null) {
//							if(node == slow) {
//								return slow;
//							} else {
//								slow = slow.next;
//							}
//							if(slowTmp == slow) {
//								break;
//							}
//						}
//						node = node.next;
//					}
//					解法二：更加简洁
					ListNode node = head;
					while(node != slow) {
						slow = slow.next;
						node = node.next;
					}
					return node;
				}
			}
		}
        return null;
    }
}
