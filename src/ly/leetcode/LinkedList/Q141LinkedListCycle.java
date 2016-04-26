/*
 * Q141LinkedListCycle.java
 *
 *  Created on: 2016Äê4ÔÂ22ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q141LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		} else {
			ListNode fast = head;
			ListNode slow = head;
			while(fast != null) {
				fast = fast.next;
				slow = slow.next;
				if(fast == null) {
					return false;
				}			
				fast = fast.next;
				if(fast == slow) {
					return true;
				}
			}
			return false;
		}
	}
}
