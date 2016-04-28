/*
 * Q232ImplementQueueUsingStacks.java
 *
 *  Created on: 2016Äê4ÔÂ28ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Stack;

import java.util.Stack;

public class Q232ImplementQueueUsingStacks {
	class MyQueue {
	    private Stack<Integer> stack1;
	    private Stack<Integer> stack2;
	    
	    public MyQueue() {
	    	stack1 = new Stack<>();
	    	stack2 = new Stack<>();
	    }
		
		// Push element x to the back of queue.
	    public void push(int x) {
	        stack1.push(x);
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        if(stack2.isEmpty()) {
	        	while(!stack1.isEmpty()) {
	        		stack2.push(stack1.pop());
	        	}
	        	stack2.pop();
	        } else {
	        	stack2.pop();
	        }
	    }

	    // Get the front element.
	    public int peek() {
	    	if(stack2.isEmpty()) {
	        	while(!stack1.isEmpty()) {
	        		stack2.push(stack1.pop());
	        	}
	        	return stack2.peek();
	        } else {
	        	return stack2.peek();
	        }
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	    	if(stack1.isEmpty() && stack2.isEmpty()) {
	    		return true;
	    	}
			return false;
	    }
	}
}
