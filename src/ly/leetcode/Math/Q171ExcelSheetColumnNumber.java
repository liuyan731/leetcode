package ly.leetcode.Math;
/*
 * Excel.java
 *
 *  Created on: 2016Äê4ÔÂ30ÈÕ
 *      Author: liuyan
 */

public class Q171ExcelSheetColumnNumber {
	public static void main(String[] args) {
		System.out.println(titleToNumber("SD"));
	}
	public static int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int ret = 0;
        for (int i = 0; i < c.length; i++) {
        	ret = ret + (int) ((c[i] - 'A' + 1) * Math.pow(26, (c.length - i - 1)));
		}
		return ret;
    }
}
