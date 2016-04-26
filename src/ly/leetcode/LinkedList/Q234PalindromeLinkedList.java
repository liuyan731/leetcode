/*
 * Q234PalindromeLinkedList.java
 *  判断回文链表
 *  Created on: 2016年4月21日
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
	
	//可以使用栈，将原链表push到栈中，然后pop出来与原链表比较
	
	//首先找到链表的中心位置，然后就地反转链表的后半部分，然后与前半部分相比较
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
	
	public static ListNode findMid(ListNode l) {	// 找到链表的中点位置节点
		// 使用快慢指针，快速指针每次走两步，慢指针每次只走一步，当快指针走到头的时候，正好慢指针在中间位置，取慢指针.next就是后半部分
		ListNode fast = l;
		ListNode slow = l;
		while((fast.next != null && fast.next.next != null ) && slow.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode ret = slow.next;
		return ret;
	}
	
	public static ListNode reverse(ListNode l) { // 就地反转链表（非递归）
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

