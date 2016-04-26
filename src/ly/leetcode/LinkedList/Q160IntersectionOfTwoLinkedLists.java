/*
 * Q160IntersectionOfTwoLinkedLists.java
 *
 *  Created on: 2016年4月22日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q160IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		ListNode nodeA = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		ListNode nodeB = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(3);

		nodeA.next = node2;
		node2.next = node3;

		nodeB.next = node5;
		node5.next = node6;
		node6.next = node7;

		getIntersectionNode2(nodeA, nodeB);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) { // 这种方式会改变原始链表的结构
		
		if(headA == null || headB == null) {
			return null;
		} 
		
		// 先就地反转两个链表，然后从前往后对比
		ListNode A = headA;
		ListNode p = A.next;
		A.next = null;
		ListNode q = null;
		while (p != null) {
			q = p;
			p = p.next;
			q.next = A;
			A = q;
		}

		ListNode B = headB;
		ListNode p1 = B.next;
		B.next = null;
		ListNode q1 = null;
		while (p1 != null) {
			q1 = p1;
			p1 = p1.next;
			q1.next = B;
			B = q1;
		}

		ListNode ret = A;
		while (A != null && B != null) {
			if(A.next == B.next) {
				A = A.next;
				B = B.next;
			} else {
				A.next = null;
				break;
			}
		}

		return ret;
	}

	public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null) {
			return null;
		} 
		
		ListNode p = headA;
		int lenA = 1;
		ListNode q = headB;
		int lenB = 1;
		
		while(p.next != null) {
			p = p.next;
			lenA += 1;
		}
		
		while(q.next != null) {
			q = q.next;
			lenB += 1;
		}
		
		ListNode idxA = headA;
		ListNode idxB = headB;
		while(lenA > lenB) {
			idxA = idxA.next;
			lenA--;
		}
		while(lenA < lenB) {
			idxB = idxB.next;
			lenB--;
		}
		
		while(idxA != null && idxB != null) {
			if(idxA.val != idxB.val) {
				idxA = idxA.next;
				idxB = idxB.next;
			} else {
				break;
			}
		}
		
		return idxB;
	}
}
