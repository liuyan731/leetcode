/*
 * Q067AddBinary.java
 *
 *  Created on: 2016年6月10日
 *      Author: liuyan
 */

package ly.leetcode.Math;

public class Q067AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "11"));
	}

	public static String addBinary(String a, String b) {
		if (a == null || a.length() == 0) {
			return b;
		}
		if (b == null || b.length() == 0) {
			return a;
		} else {
			char[] aChars = a.toCharArray();
			char[] bChars = b.toCharArray();

			int aLen = aChars.length - 1;
			int bLen = bChars.length - 1;
			int charge = 0;
			StringBuilder sb = new StringBuilder("");

			while (aLen >= 0 || bLen >= 0 || charge == 1) {
				int c1 = (aLen >= 0) ? Integer.parseInt(aChars[aLen] + "") : 0;
				int c2 = (bLen >= 0) ? Integer.parseInt(bChars[bLen] + "") : 0;
				int result = 0;
				
				result = c1 ^ c2 ^ charge;
				if (c1 + c2 + charge >= 2) {
					charge = 1;
				} else {
					charge = 0;
				}
				sb.append(result);
				aLen--;
				bLen--;
			}
			return sb.reverse().toString();
		}
	}

	/**
	 * 转为int然后转为binary会整形溢出
	 */
	public String addBinary2(String a, String b) {
		return Integer.toBinaryString((toNum(a) + toNum(b)));
	}

	public int toNum(String str) {
		int num = 0;
		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			num = num + (int) Math.pow(2, cs.length - i - 1) * Integer.parseInt(cs[i] + "");
		}
		return num;
	}
}
