/*
 * Q290WordPattern.java
 *
 *  Created on: 2016Äê4ÔÂ29ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.HashTable;

import java.util.HashMap;

public class Q290WordPattern {
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat fish"));
	}
	
	public static boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map = new HashMap<>();
		char[] cs = pattern.toCharArray();
		String[] strs = str.split(" ");
		if(cs.length != strs.length) {
			return false;
		} else {
			for (int i = 0; i < cs.length; i++) {
				if(map.containsKey(cs[i])) {
					if(!map.get(cs[i]).equals(strs[i])) {
						return false;
					} else {
						continue;
					}
				} else if(!map.containsKey(cs[i]) && map.containsValue(strs[i])) {
					return false;
				} else {
					map.put(cs[i], strs[i]);
				}
			}
		}
		return true;
	}
}
