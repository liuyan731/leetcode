/*
 * Q070ClimbingStairs.java
 *
 *  Created on: 2016Äê4ÔÂ28ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.DynamicProgramming;

public class Q070ClimbingStairs {
	public int climbStairs(int n) {
        if(n == 0) {
        	return 0;
        } else if(n == 1) {
        	return 1;
        } else {
        	int[] dp  = new int[n + 1];
        	dp[0] = 0;
        	dp[1] = 1;
        	dp[2] = 2;
        	
        	for (int i = 3; i < dp.length; i++) {
        		dp[i] = dp[i - 2] + dp[i - 1];
        	}
        	return dp[n];
        }
    }
}
