/*
 * Q217ContainsDuplicate.java
 *
 *  Created on: 2016Äê5ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Array;

import java.util.HashSet;

public class Q217ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,2};
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return set.size() != nums.length;
	}
}
