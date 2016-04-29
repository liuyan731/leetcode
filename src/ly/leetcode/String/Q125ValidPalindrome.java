/*
 * Q125ValidPalindrome.java
 *
 *  Created on: 2016Äê4ÔÂ29ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.String;

public class Q125ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("1b1"));
	}

	public static boolean isPalindrome(String s) {
		s = s.toUpperCase();
		int l = 0;
		int r = s.length() - 1;
		while (l <= r) {
			if (!(('A' <= s.charAt(l) && s.charAt(l) <= 'Z') || ('0' <= s.charAt(l) && s.charAt(l) <= '9'))) {
				l++;
				continue;
			}

			if (!(('A' <= s.charAt(r) && s.charAt(r) <= 'Z') || ('0' <= s.charAt(r) && s.charAt(r) <= '9'))) {
				r--;
				continue;
			}

			if (s.charAt(l) == s.charAt(r)) {
				l++;
				r--;
			} else {
				return false;
			}
		}
		return true;
	}
}
