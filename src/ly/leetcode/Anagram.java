/*
 * Anagram.java
 *
 *  Created on: 2016Äê4ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "bwc"));
	}

	public static boolean isAnagram(String s, String t) {
		boolean ret = false;
		if (s.equals(t)) {
			ret = true;
		} else {

			char[] ss = s.toCharArray();
			char[] tt = t.toCharArray();
			ArrayList<Character> l1 = new ArrayList<>();
			ArrayList<Character> l2 = new ArrayList<>();

			for (int i = 0; i < ss.length; i++) {
				l1.add(ss[i]);
			}

			for (int i = 0; i < tt.length; i++) {
				l2.add(tt[i]);
			}

			Collections.sort(l1);

			Collections.sort(l2);

			if (l1.size() == l2.size()) {
				for (int i = 0; i < l1.size(); i++) {
					if (l1.get(i) != l2.get(i)) {
						ret = false;
						break;
					} else {
						ret = true;
					}
				}
			} else {
				ret = false;
			}
		}

		return ret;
	}
}
