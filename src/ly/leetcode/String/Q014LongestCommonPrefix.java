/*
 * Q14LongestCommonPrefix.java
 *
 *  Created on: 2016Äê5ÔÂ10ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.String;

public class Q014LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(getCommonPrefix("123adasdfasdf", "123asd"));
		String[] strs = {"123adasdfasdf", "123asd", "12asdasd"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		String ret = strs[0];
		for (int i = 1; i < strs.length; i++) {
			ret = getCommonPrefix(ret, strs[i]);
		}
		return ret;
	}
	
	public static String getCommonPrefix(String str1, String str2) {
		StringBuilder sb = new StringBuilder("");
		if(str2.length() < str1.length()) {
			for (int i = 0; i < str2.length(); i++) {
				if(str1.charAt(i) == str2.charAt(i)) {
					sb.append(str1.charAt(i));
				} else {
					break;
				}
			}
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) == str2.charAt(i)) {
					sb.append(str1.charAt(i));
				} else {
					break;
				}
			}
		}
		return sb.toString();
	}
}
