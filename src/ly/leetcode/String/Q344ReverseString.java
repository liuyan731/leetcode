/*
 * ReverseString.java
 *	字符串的转置
 *  Created on: 2016年4月28日
 *      Author: liuyan
 */

package ly.leetcode.String;

import java.util.Stack;

public class Q344ReverseString {
	public String reverseString1(String s) { // 直接使用StringBuilder的reverse方法
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public String reverseString2(String s) { // 使用栈
		char[] cs = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : cs) {
			stack.push(c);
		}
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < cs.length; i++) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}

	public String reverseString3(String s) { // 使用数组的就地逆置的思想
		if(s.length() == 0 || s.length() == 1) {
			return s;
		} else {
			char[] cs = s.toCharArray();
			int l = 0, r = cs.length - 1, mid = (l + r) / 2;
			for (int i = l; i <= mid; i++) {
				char temp = cs[i];
				cs[i] = cs[cs.length - 1 - i];
				cs[cs.length - 1 - i] = temp;
			}
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < cs.length; i++) {
				sb.append(cs[i]);
			}
			return sb.toString();
		}
	}
}
