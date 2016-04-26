/*
 * TwoSum.java
 *
 *  Created on: 2016Äê3ÔÂ15ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { -1, -2, -3, -4, -5 };
		int target = -8;
		int ret[] = twoSum(nums, target);
		System.out.println(ret[0] + "," + ret[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && i != j) {
					if(i < j) {
						result[0] = i;
						result[1] = j;
					} else {
						result[0] = j;
						result[1] = i;
					}
					break;
				}
			}
		}
		return result;
	}
}
