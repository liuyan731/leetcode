/*
 * Q26RemoveDuplicates.java
 *
 *  Created on: 2016Äê4ÔÂ5ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q026RemoveDuplicates {
	public static void main(String[] args) {
		int mat[] = {1,2,2};
		System.out.println(removeDuplicates(mat));
	}

	public static int removeDuplicates(int[] nums) {
		int ret = nums.length;
		int idx = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				// for (int j = i; j < nums.length - 1; j++) {
				// nums[j] = nums[j + 1];
				// nums[nums.length - 1] = -1;
				// }
				nums[idx] = nums[i];
				idx++;
				ret--;
			}
		}
		return ret;
	}
}
