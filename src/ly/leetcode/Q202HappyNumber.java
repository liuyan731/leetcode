/*
 * Q202HappyNumber.java
 *
 *  Created on: 2016Äê4ÔÂ20ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q202HappyNumber {
	public static void main(String[] args) {
		System.out.println(getSqrtSum(2));
		System.out.println(isHappy(10));
	}

	public static boolean isHappy(int n) {
		boolean ret = false;
		if(n == 1) {
			return true;
		} else {
			while(n / 10 == 0) {
				n = n * n;
				if(n > 10) {
					break;
				}
			}
			while (n >= 10 || n == 7) {
				if (getSqrtSum(n) == 1) {
					ret = true;
					break;
				} else {
					n = getSqrtSum(n);
				}
			}
		}
		return ret;
	}

	public static int getSqrtSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum = (int) (sum + Math.pow(n % 10, 2));
			n = n / 10;
		}
		return sum;
	}
}
