/*
 * Q027RemoveElement.java
 *
 *  Created on: 2016Äê4ÔÂ29ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Array;

public class Q027RemoveElement {
	public static void main(String[] args) {
		int mat[] = { 3, 2, 3, 2, 2, 2, 3 };
		System.out.println(removeElement(mat, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		int p = 0;
		int ret = nums.length;
		while (count < nums.length) {
			if (nums[p] == val) {
				for (int i = p; i < nums.length - 1; i++) {
					nums[i] = nums[i + 1];
				}
				ret--;
			} else {
				p++;
			}

			count++;
		}
		return ret;
	}
}
