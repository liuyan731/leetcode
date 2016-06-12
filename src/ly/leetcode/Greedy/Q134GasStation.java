/*
 * Q134GasStation.java
 *	对于一个循环数组，如果这个数组整体和 SUM >= 0，那么必然可以在数组中找到这么一个元素：从这个数组元素出发，绕数组一圈，能保证累加和一直是出于非负状态。
 *  Created on: 2016年5月8日
 *      Author: liuyan
 */

package ly.leetcode.Greedy;

public class Q134GasStation {
	public static void main(String[] args) {
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0; // 总消耗
		int sum = 0; // 油箱剩余
		int start = 0; // 起始点
		for (int i = 0; i < gas.length; i++) {
			total += (gas[i] - cost[i]);	// 一直计算所有的“收+支”
			if (sum < 0) { // 若油箱空，从下一个开始
				sum = gas[i] - cost[i];
				start = i;
			} else {	// 若油箱不为空，则继续累积邮箱的剩余
				sum += (gas[i] - cost[i]);
			}
		}
		// 对于一个循环数组，如果这个数组整体和 SUM >=
		// 0，那么必然可以在数组中找到这么一个元素：从这个数组元素出发，绕数组一圈，能保证累加和一直是出于非负状态。
		return total < 0 ? -1 : start;
	}
	
	public int canCompleteCircuit2(int[] gas, int[] cost) {
		int sumGas = 0;
		int sumCost = 0;
		int start = 0;
		int tank = 0;
		for (int i = 0; i < gas.length; i++) {
			sumGas += gas[i];
			sumCost += cost[i];
			tank += (gas[i] - cost[i]);
			if(tank < 0) {
				start = i + 1;	//从下一个开始
				tank = 0;
			}
		}
		
		if(sumGas < sumCost) {
			return -1;
		} else {
			return start;
		}
	}
}
