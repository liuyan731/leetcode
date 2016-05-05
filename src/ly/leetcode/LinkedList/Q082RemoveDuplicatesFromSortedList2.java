/*
 * Q082RemoveDuplicatesFromSortedList.java
 *
 *  Created on: 2016��4��22��
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q082RemoveDuplicatesFromSortedList2 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		deleteDuplicates2(node1);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode newHead = new ListNode(-1);
		newHead.next = head;	//newHead��Ϊ�˱�֤��һ���ڵ���Ա�ɾ��
		ListNode pPrev = newHead;
		ListNode p = newHead.next;
		ListNode q = newHead.next.next;
		int val = -2;
		while(q != null) {
			if(p.val == q.val) {	//��¼��ͬ�ڵ��val
				val = p.val; //�õ��ڵ���ֵͬ��val
				while(q!=null) {
					if(p.val == val) {
						pPrev.next = p.next; 	//ɾ��ֵΪval�Ľڵ�
						p = p.next;
						q = q.next;
					} else {
						val = -2;
						break;
					}
				}
			} else {	//����˳��
				p = p.next;
				q = q.next;
				pPrev = pPrev.next;
				val = -2;
			}
		}
		
		if(pPrev.next.val == val) {	//��ֹ�������һ���ڵ��޷�ɾ�������
			pPrev.next = pPrev.next.next;
		}
		
		return newHead.next;
	}
	
	public static ListNode deleteDuplicates2(ListNode head) {
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode p = newHead;
		ListNode q = p.next;
		while(q != null) {
			while(q.next != null && q.val == q.next.val) {
				q = q.next;
			}
			if(p.next != q) {
				p.next = q.next;
				q = p.next;
			} else {
				p = p.next;
				q = q.next;
			}
		}
		return newHead.next;
	}
}
