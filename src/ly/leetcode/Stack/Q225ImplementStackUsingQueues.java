/*
 * Q225ImplementStackUsingQueues.java
 *
 *  Created on: 2016Äê6ÔÂ11ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Q225ImplementStackUsingQueues {
	
	public static void main(String[] args) {
		System.out.println(true && false);
	}
	
	class MyStack {

		private Queue<Integer> queue1;
		private Queue<Integer> queue2;

		public MyStack() {
			queue1 = new LinkedList<>();
			queue2 = new LinkedList<>();
		}

		// Push element x onto stack.
		public void push(int x) {
			if (queue1.isEmpty() && queue2.isEmpty()) {
				queue1.offer(x);
			} else if (!queue1.isEmpty()) {
				queue1.offer(x);
			} else if (!queue2.isEmpty()) {
				queue2.offer(x);
			}
		}

		// Removes the element on top of the stack.
		public void pop() {
			if (!queue1.isEmpty()) {
				while (queue1.size() > 1) {
					queue2.offer(queue1.poll());
				}
				queue1.poll();
			} else if (!queue2.isEmpty()) {
				while (queue2.size() > 1) {
					queue1.offer(queue2.poll());
				}
				queue2.poll();
			}
		}

		// Get the top element.
		public int top() {
			int top = 0;
			if (!queue1.isEmpty()) {
				while (queue1.size() > 1) {
					queue2.offer(queue1.poll());
				}
				top = queue1.peek();
				queue2.offer(queue1.poll());
			} else if (!queue2.isEmpty()) {
				while (queue2.size() > 1) {
					queue1.offer(queue2.poll());
				}
				top = queue2.peek();
				queue1.offer(queue2.poll());
			}
			return top;
		}

		// Return whether the stack is empty.
		public boolean empty() {
			return queue1.isEmpty() && queue2.isEmpty();
		}
	}
}
