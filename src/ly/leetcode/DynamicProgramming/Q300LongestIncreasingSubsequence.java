/*
 * Q300LongestIncreasingSubsequence.java
 *
 *  Created on: 2016Äê4ÔÂ29ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.DynamicProgramming;

public class Q300LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
		int dp[] = new int[nums.length];
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if ((nums[j] < nums[i]) && (dp[i] < dp[j] + 1)) {
					dp[i] = dp[j] + 1;
				}
			}
			if(dp[i] > maxLen) {
				maxLen = dp[i];
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int nums[] = {0};
		System.out.println(lengthOfLIS(nums));
	}
}
