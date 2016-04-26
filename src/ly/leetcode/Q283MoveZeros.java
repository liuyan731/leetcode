/*
 * Q283MoveZeros.java
 *
 *  Created on: 2016Äê4ÔÂ3ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q283MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					if(nums[j] != 0) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						break;
					}
				}
			}
		}
    }
}
