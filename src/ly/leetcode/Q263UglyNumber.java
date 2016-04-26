/*
 * Q263UglyNumber.java
 *
 *  Created on: 2016Äê4ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q263UglyNumber {
	public static void main(String[] args) {
		System.out.println(1 % 5);

		System.out.println(isUgly(0));
	}

	public static boolean isUgly(int num) {
		if (num == 0) {
			return false;
		} else {
			while (num % 2 == 0) {
				num = num / 2;
			}
			while (num % 3 == 0) {
				num = num / 3;
			}
			while (num % 5 == 0) {
				num = num / 5;
			}
			if (num == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
}
