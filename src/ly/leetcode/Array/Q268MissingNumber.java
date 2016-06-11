/*
 * Q268MissingNumber.java
 *
 *  Created on: 2016Äê6ÔÂ11ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Array;

public class Q268MissingNumber {
	public static void main(String[] args) {
		int nums[] = {0,2,3};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int ret = 0;
		int sum1 = (nums.length + 1) * nums.length / 2;
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum2 = sum2 + nums[i];
		}
		return sum1 - sum2;
	}
}
