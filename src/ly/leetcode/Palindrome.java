/*
 * Palindrome.java
 *
 *  Created on: 2016Äê3ÔÂ15ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Palindrome {
	public static void main(String[] args) {
		// System.out.println(isPalindrome1(1211));
		System.out.println(isPalindrome2(121));
	}

	public static boolean isPalindrome1(int x) {
		if (x < 0) {
			return false;
		} else {
			String str = x + "";
			StringBuffer sb = new StringBuffer(str);
			String str2 = sb.reverse().toString();
			if (str.equals(str2)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isPalindrome2(int x) {
		if(x < 0) {
			return false;
		} else {
			int num = x;
			int temp = 0;
			
			while (x > 0) {
				temp = temp * 10;
				temp = temp + x % 10;
				x = x / 10;
			}
			
			if (num == temp) {
				return true;
			} else {
				return false;
			}
		}
	}
}
