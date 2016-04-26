/*
 * Q88MergeSortedArray.java
 *
 *  Created on: 2016Äê4ÔÂ9ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q088MergeSortedArray {
	public static void main(String[] args) {
		int nums1[] = { 2,0 };
		int nums2[] = { 1 };
		merge(nums1, 1, nums2, 1);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(m == 0) {
			for (int i = 0; i < nums2.length; i++) {
				nums1[i] = nums2[i];
			}
		} else if(n == 0) {
			
		} else {
			int i = m - 1;
			int j = n - 1;
			int idx = m + n - 1;
			while (i >= 0 && j >= 0) {
				if (nums1[i] > nums2[j]) {
					nums1[idx] = nums1[i];
					i--;
				} else {
					nums1[idx] = nums2[j];
					j--;
				}
				idx--;
			}
			
			if (i > 0) {
				
			} else {
				for (int k = 0; k <= j; k++) {
					nums1[k] = nums2[k];
				}
			}
		}
		
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
}
