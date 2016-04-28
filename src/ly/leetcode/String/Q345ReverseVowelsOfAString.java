/*
 * Q345ReverseVowelsOfAString.java
 *
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ly.leetcode.String;

import java.util.ArrayList;

public class Q345ReverseVowelsOfAString {
	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}
	
	public static String reverseVowels(String s) {
		char[] cs = s.toCharArray();
		int l = 0, r = cs.length - 1;
		ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		int idx = r;
		for (int i = l; i <= r; i++) {
			if(vowels.contains(cs[i])) {
				for (int j = idx; j > i; j--) {
					idx = j - 1;	//��¼ÿ�δӺ���ǰ�ҵ�λ�ã������ظ�����
					if(vowels.contains(cs[j])) {
						char temp = cs[i];
						cs[i] = cs[j];
						cs[j] = temp;
						break;	//����λ�ú�ֱ��break�����´β���
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder("");
		for (char c : cs) {
			sb.append(c);
		}
		return sb.toString();
	}
}
