/*
 * Q191NumberOf1Bits.java
 *
 *  Created on: 2016Äê5ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Math;

public class Q191NumberOf1Bits {
	public static void main(String[] args) {
		System.out.println(hammingWeight(123));
		System.out.println(hammingWeight1(1231231233));
		System.out.println(3>>1);
	}

	public static int hammingWeight(int n) {
		if (n == 0) {
			return 0;
		} else {
			int count = 0;
			while (n > 0) {
				if(n % 2 == 1) {
					count++;
				}
				n = n / 2;
			}
			return count;
		}
	}
	
	public static int hammingWeight1(int n) {
		int count = 0;
		while(n != 0) {
			if((n & 1) == 1) {
				count++;
			}
			n >>>= 1;
		}
		return count;
	}
}
