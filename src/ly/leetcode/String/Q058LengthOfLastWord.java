/*
 * Q058LengthOfLastWord.java
 *
 *  Created on: 2016��4��28��
 *      Author: liuyan
 */

package ly.leetcode.String;

public class Q058LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String[] strs = s.split(" ");
		if(strs.length == 0) {
			return 0;
		}
		return strs[strs.length - 1].length();
	}
}
