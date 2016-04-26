/*
 * AddTwoNumbers.java
 *
 *  Created on: 2016年3月15日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q002AddTwoNumbers {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(8);
		ListNode node2 = new ListNode(9);
		ListNode node3 = new ListNode(9);
		ListNode node5 = new ListNode(9);
		
		ListNode node4 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node5;

		addTwoNumbers(node1, node4);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		} else if(l2 == null) {
			return l1;
		} else {
			ListNode temp;
			ListNode ret;
			// 找长度长的
			ListNode t1 = l1;
			ListNode t2 = l2;
			while(t1 != null && t2 != null) {
				t1 = t1.next;
				t2 = t2.next;
			}
			if(t1 != null) {
				ret = l1;
				temp = l1;
			} else {
				ret = l2;
				temp = l2;
			}
			
			int carry = 0;
			while(l1 != null && l2 != null) {
				if(l1.val + l2.val + carry >= 10) {
					temp.val = (l1.val + l2.val - 10 + carry);
					carry = 1;
				} else {
					temp.val = l1.val + l2.val + carry;
					carry = 0;
				}
				
				if(carry >= 1 && temp.next == null) {
					ListNode addNode = new ListNode(1);
					temp.next = addNode;
					carry = 0;
				}
				
				l1 = l1.next;
				l2 = l2.next;
				temp = temp.next;
			}
			
			if(carry > 0 && l1 != null && l2 == null) {
				while(l1 != null) {
					if(carry + l1.val >= 10) {
						l1.val = l1.val + carry - 10;
						if(l1.next== null) {
							ListNode addNode = new ListNode(1);
							l1.next = addNode;
							carry = 0;
						}
					} else {
						l1.val = l1.val + carry;
						carry = 0;
					}
					l1 = l1.next;
				}
			} else if(carry > 0 && l2 != null && l1 == null) {
				while(l2 != null) {
					if(carry + l2.val >= 10) {
						l2.val = l2.val + carry - 10;
						if(l2.next== null) {
							ListNode addNode = new ListNode(1);
							l2.next = addNode;
							carry = 0;
						}
					} else {
						l2.val = l2.val + carry;
						carry = 0;
					}
					l2 = l2.next;
				}
			}
			return ret;
		}
	}
}
