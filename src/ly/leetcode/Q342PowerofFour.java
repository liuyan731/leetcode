/*
 * Q342PowerofFour.java
 *
 *  Created on: 2016Äê4ÔÂ20ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q342PowerofFour {
	public static void main(String[] args) {
		 System.out.println(isPowerOfFour(16));
	}

	public static boolean isPowerOfFour(int num) {
		if (num == 1) {
			return true;
		} else {
			boolean ret = false;
			while (num > 0) {
				if (num == 1) {
					ret = true;
					break;
				} else if (num % 4 == 0) {
					num = num / 4;
				} else {
					ret = false;
					break;
				}
			}
			return ret;
		}
	}
}
