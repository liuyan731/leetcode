/*
 * Q026RemoveDuplicatesFromSortedArray.java
 *
 *  Created on: 2016年4月29日
 *      Author: liuyan
 */

package ly.leetcode.Array;

public class Q026RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int mat[] = { 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(mat));
	}

	public static int removeDuplicates(int[] nums) {
		int ret = nums.length;
		int p = 0;	//两个index来判断是否相等
		int q = 1;
		int count = 0;	//用来控制往后遍历的次数
		while (count < nums.length - 1) {
			if (nums[p] == nums[q]) {
				ret--;
				for (int i = q; i < nums.length - 1; i++) {	//每次把后面的元素都往前移
					nums[i] = nums[i + 1];
				}
			} else {
				q++;
				p++;
			}
			count++;
		}
		return ret;
	}
}
