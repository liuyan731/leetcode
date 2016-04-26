/*
 * Q169MajorityElement.java
 *
 *  Created on: 2016Äê4ÔÂ20ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q169MajorityElement {
	public static void main(String[] args) {
		int nums[] = {10,9,9,9,10};
		quickSort(nums, 0, nums.length - 1);
		
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	
	public static int majorityElement(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums[nums.length / 2];
	}

	public static void quickSort(int nums[], int l, int r) {
		if(l < r) {
			int i = l, j = r, x = nums[l];
			while(i < j) {
				while(i < j && x < nums[j]) {
					j--;
				}
				if(i < j) {
					nums[i++] = nums[j];
				}
				
				while(i < j && x > nums[i]) {
					i++;
				}
				if(i < j) {
					nums[j--] = nums[i];
				}
			}
			
			nums[i] = x;
			quickSort(nums, l, i - 1);
			quickSort(nums, i + 1, r);
		}
	}
}
