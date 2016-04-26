/*
 * Q66PlusOne.java
 *
 *  Created on: 2016Äê4ÔÂ5ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

import java.math.BigDecimal;

public class Q066PlusOne {
	public static void main(String[] args) {
		int mat[] = {9,9,9,9,9,9,9,9,9};
		plusOne(mat);
	}

	public static int[] plusOne(int[] digits) {
		String str = "";
		for (int i = 0; i < digits.length; i++) {
			str += digits[i];
		}
		BigDecimal bd = new BigDecimal(str);
		bd = bd.add(new BigDecimal("1"));
		int ret[] = new int[bd.toString().length()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Integer.parseInt(bd.toString().charAt(i) + "");
		}
		return ret;
	}
}
