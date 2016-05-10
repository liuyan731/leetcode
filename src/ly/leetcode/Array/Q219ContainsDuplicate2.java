/*
 * Q219ContainsDuplicate2.java
 *
 *  Created on: 2016Äê5ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class Q219ContainsDuplicate2 {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,3};
		System.out.println(containsNearbyDuplicate(nums, 3));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.keySet().contains(nums[i])) {
				if(i - map.get(nums[i]) <= k) {
					return true;
				}
				map.put(nums[i], i);
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
