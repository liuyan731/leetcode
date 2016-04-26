/*
 * Q234PalindromeLinkedList.java
 *  �жϻ�������
 *  Created on: 2016��4��21��
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q234PalindromeLinkedList {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
//		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(2);
		ListNode node7 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node5;
//		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
//		reverse(node1);
//		findMid(node1);
		System.out.println(isPalindrome(node1));
	}
	
	//����ʹ��ջ����ԭ����push��ջ�У�Ȼ��pop������ԭ����Ƚ�
	
	//�����ҵ����������λ�ã�Ȼ��͵ط�ת����ĺ�벿�֣�Ȼ����ǰ�벿����Ƚ�
	public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		} else {
			ListNode mid = findMid(head);
			mid = reverse(mid);
			while(head != null && mid != null) {
				if(head.val != mid.val) {
					return false;
				}
				head = head.next;
				mid = mid.next;
			}
			return true;
		}
    }
	
	public static ListNode findMid(ListNode l) {	// �ҵ�������е�λ�ýڵ�
		// ʹ�ÿ���ָ�룬����ָ��ÿ������������ָ��ÿ��ֻ��һ��������ָ���ߵ�ͷ��ʱ��������ָ�����м�λ�ã�ȡ��ָ��.next���Ǻ�벿��
		ListNode fast = l;
		ListNode slow = l;
		while((fast.next != null && fast.next.next != null ) && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode ret = slow.next;
		return ret;
	}
	
	public static ListNode reverse(ListNode l) { // �͵ط�ת�����ǵݹ飩
		ListNode p = l.next;
		l.next = null;
		ListNode q = null;
		while(p != null) {
			q = p;
			p = p.next;
			q.next = l;
			l = q;
		}
		return l;
	}
}

