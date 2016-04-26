/*
 * SwapNodesInPairs.java
 *
 *  Created on: 2016年4月3日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q024SwapNodesInPairs {
	public static void main(String[] args) {

	}

	public ListNode swapPairs(ListNode head) {	//递归实现
		if(head == null || head.next == null) {
			return head;
		}
		ListNode node1 = head.next;
		ListNode node2 = node1.next;
    	node1.next = head;
		head.next = swapPairs(node2);
		return node1;
	}
}
