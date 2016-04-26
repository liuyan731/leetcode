/*
 * Q237DeleteNodeInALinkedList.java
 *
 *  Created on: 2016Äê4ÔÂ20ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q237DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
