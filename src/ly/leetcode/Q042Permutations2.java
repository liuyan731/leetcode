/*
 * Permutations2.java
 *
 *  Created on: 2016年4月3日
 *      Author: liuyan
 */

package ly.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q042Permutations2 {
	public static void main(String[] args) {
		// int[] mat = {1,1,0,0,1,-1,-1,1};
		int[] mat = { 2, 1, 1, 1, 1 };
		permutation(mat, 0, mat.length - 1);
	}

	public static List<List<Integer>> ret = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		permutation(nums, 0, nums.length - 1);
		return ret;
	}

	public static void permutation(int[] nums, int l, int r) {
		if (l > r) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i : nums) {
				System.out.print(i + " ");
				list.add(i);
			}
			ret.add(list);
			System.out.println();
		}

		for (int i = l; i <= r; i++) {
			if (isSwap(nums, l, i)) {	// 加入是否可以swap的判断,可以大大减小计算量
				swap(nums, l, i);
				permutation(nums, l + 1, r);
				swap(nums, l, i);
			}
		}
	}

	public static boolean isSwap(int[] nums, int start, int end) {
		for (int i = start; i < end; i++) {
			if (nums[i] == nums[end]) {
				return false;
			}
		}
		return true;
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
