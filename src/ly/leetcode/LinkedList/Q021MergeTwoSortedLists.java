/*
 * MergeTwoSortedLists.java
 *
 *  Created on: 2016年4月3日
 *      Author: liuyan
 */

package ly.leetcode.LinkedList;

public class Q021MergeTwoSortedLists {
	public static void main(String[] args) {

	}

	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) { //递归版本实现
		ListNode ret;
		if(l1 == null) {
			return l2;
		} else if(l2 == null) {
			return l1;
		}
		if(l1.val < l2.val) {
			ret = l1;
			ret.next = mergeTwoLists2(l1.next, l2);
		} else {
			ret = l2;
			ret.next = mergeTwoLists2(l1, l2.next);
		}
		return ret;
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {	//非递归版本实现
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode first = l1;
		ListNode second = l2;
		ListNode ret = null;
		ListNode retEnd = null;

		while (first != null && second != null) {
			if(first.val <= second.val) {
				if(ret == null) {
					ret = first;
					retEnd = ret;
				} else {
					ret.next = first;
					retEnd = retEnd.next;
				}
				first = first.next;
			} else {
				if(ret == null) {
					ret = second;
					retEnd = ret;
				} else {
					ret.next = second;
					retEnd = retEnd.next;
				}
				second = second.next;
			}
		}
		
		if(first != null) {
			retEnd.next = first;
		}
		
		if(second != null) {
			retEnd.next = second;
		}

		return ret;
	}
}
