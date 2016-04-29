/*
 * Q026RemoveDuplicatesFromSortedArray.java
 *
 *  Created on: 2016��4��29��
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
		int p = 0;	//����index���ж��Ƿ����
		int q = 1;
		int count = 0;	//����������������Ĵ���
		while (count < nums.length - 1) {
			if (nums[p] == nums[q]) {
				ret--;
				for (int i = q; i < nums.length - 1; i++) {	//ÿ�ΰѺ����Ԫ�ض���ǰ��
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
