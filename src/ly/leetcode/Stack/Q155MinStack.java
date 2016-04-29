/*
 * Q155MinStack.java
 *
 *  Created on: 2016Äê4ÔÂ29ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Stack;

import java.util.Stack;

public class Q155MinStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Q155MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        if(minStack.isEmpty() || minStack.peek() >= x) {
        	minStack.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.isEmpty() || minStack.isEmpty()) {
        	return;
        } else {
        	if(minStack.peek().equals(stack.pop())) {
        		minStack.pop();
        	}
        }
    }
    
    public int top() {
    	if(stack.isEmpty()) {
    		return 0;
    	} else {
    		return stack.peek();
    	}
    }
    
    public int getMin() {
		if(minStack.isEmpty()) {
			return 0;
		} else {
			return minStack.peek();
		}
    }
}
