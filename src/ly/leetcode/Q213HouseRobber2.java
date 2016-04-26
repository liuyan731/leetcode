/*
 * Q213HouseRobber2.java
 *
 *  Created on: 2016Äê4ÔÂ4ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q213HouseRobber2 {
	public static void main(String[] args) {
		int mat[] = {1,2};
		System.out.println(rob(mat));
	}

	public static int rob(int[] nums) {
		
		if(nums.length == 0) {
			return 0;
		} else if(nums.length == 1) {
			return nums[0];
		} else {
			int ret[] = new int[nums.length];
			for (int i = 0; i < nums.length - 1; i++) {
				if(i == 0) {
					ret[i] = nums[i];
				} else if(i == 1) {
					ret[i] = Math.max(nums[i - 1], nums[i]);
				} else {
					ret[i] = Math.max(ret[i - 1], ret[i-2] + nums[i]);
				}
			}
			int max1 = ret[nums.length - 2];
			
			for (int i = 1; i < ret.length; i++) {
				if(i == 1) {
					ret[i] = nums[i];
				} else if(i == 2) {
					ret[i] = Math.max(nums[i - 1], nums[i]);
				} else {
					ret[i] = Math.max(ret[i - 1], ret[i - 2] + nums[i]);
				}
			}
			int max2 = ret[nums.length - 1];
			return Math.max(max1, max2);
		}
	}
}
