/*
 * Q121BestTimeToBuyAndSellStock.java
 *
 *  Created on: 2016Äê5ÔÂ11ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.DynamicProgramming;

public class Q121BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int nums[] = { 6,1,3,2,4,7 };
		System.out.println(maxProfit(nums));
	}

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}
}
