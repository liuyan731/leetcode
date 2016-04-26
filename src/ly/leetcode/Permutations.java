/*
 * Permmutation.java
 *
 *  Created on: 2016Äê4ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		permutation(nums, 0, nums.length - 1);
	}

	public static List<List<Integer>> permute(int[] nums) {
		permutation(nums, 0, nums.length - 1);
		return ret;
	}
	
	public static List<Integer> list = null;
	public static List<List<Integer>> ret = new ArrayList<>();

	public static void permutation(int[] nums, int l, int r) {
		if (l > r) {
			list = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			ret.add(list);
		}

		for (int i = l; i <= r; i++) {
			swap(nums, l, i);
			permutation(nums, l + 1, r);
			swap(nums, l, i);
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
