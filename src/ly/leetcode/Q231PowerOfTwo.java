/*
 * PowerOfTwo.java
 *
 *  Created on: 2016Äê4ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q231PowerOfTwo {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1));
	}

	public static boolean isPowerOfTwo(int n) {
		boolean ret = false;
		while (n > 1) {
			if (n % 2 != 0) {
				ret = false;
				break;
			}
			n = n / 2;
		}

		if(n == 1) {
			ret = true;
		}
		
		return ret;
	}
}
