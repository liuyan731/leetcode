/*
 * PowerOfTwo.java
 *
 *  Created on: 2016Äê4ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q326PowerOfThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}

	public static boolean isPowerOfThree(int n) {
		boolean ret = false;
		while (n > 1) {
			if (n % 3 != 0) {
				ret = false;
				break;
			}
			n = n / 3;
		}

		if(n == 1) {
			ret = true;
		}
		
		return ret;
	}
}
