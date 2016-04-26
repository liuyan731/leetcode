/*
 * Q142LinkedListCycle2.java
 *
 *  Created on: 2016��4��22��
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
				
				if(fast == slow) {	// ���ڻ��ˣ�����fast/slow
//					�ⷨһ
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
//					�ⷨ�������Ӽ��
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
