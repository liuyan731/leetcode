/*
 * Q005LongestPalindromicSubstring.java
 *
 *  Created on: 2016��4��20��
 *      Author: liuyan
 */

package ly.leetcode;

public class Q005LongestPalindromicSubstring {

	public static void main(String[] args) {
		String str1 = "123456";
		String str2 = "45";
		String ss = LCString(str1, str2);
		System.out.println(ss);

		System.out.println(longestPalindrome("22134qweewq12333"));
		
		System.out.println(strHelper("22134qweewq12333",5,6));
		
		System.out.println(longestPalindrome2("ccc"));
	}

	/**
	 * ��ԭ�ַ�����ת��Ȼ����ԭ�ַ�����������Ӵ�
	 * */
	public static String longestPalindrome(String s) { // LeetCode��ʾ��ʱ
		StringBuilder sb = new StringBuilder(s);
		String re = sb.reverse().toString();
		return LCString(s, re);
	}

	public static String LCString(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int dp[][] = new int[len1 + 1][len2 + 1];
		int max = 0;
		int idx = 0;
		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = dp[i + 1][j + 1] + 1;
					if (dp[i][j] > max) {
						max = dp[i][j];
						idx = i;
					}
				}
			}
		}

		return str1.substring(idx, idx + max);
	}

	/**
	 * ������չ����ÿ���ַ����п��ܳ�Ϊ���ģ��ҵ�����һ������
	 * */
	public static String strHelper(String s, int left, int right) { // ��ĳ���ַ���ʼ��������
		int len = s.length() - 1;
		while (left >= 0 && right <= len && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
	
	public static String longestPalindrome2(String s) {
		if(s.length() <= 1) {
			return s;
		} else {
			String temp = "";
			for (int i = 0; i < s.length() - 1; i++) {
				String ss = strHelper(s, i, i);
				if(ss.length() > temp.length()) {
					temp = ss;
				}
				
				ss = strHelper(s, i, i + 1);
				if(ss.length() > temp.length()) {
					temp = ss;
				}
			}
			return temp;
		}
	}
}
