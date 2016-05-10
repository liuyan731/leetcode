/*
 * Q220ContainsDuplicate3.java
 *
 *  Created on: 2016Äê5ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Array;

import java.util.TreeSet;

public class Q220ContainsDuplicate3 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 1 };
		System.out.println(containsNearbyAlmostDuplicate(nums, 2, 1));
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (k < 1 || t < 0 || nums.length <= 0) {
			return false;
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(((set.floor(nums[i] + t) != null) && set.floor(nums[i] + t) >= nums[i]) || 
					((set.ceiling(nums[i] - t) != null) && set.ceiling(nums[i] - t) <= nums[i])) {
				return true;
			}
			set.add(nums[i]);
			if(i >= k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}
}
