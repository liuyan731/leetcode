/*
 * Q134GasStation.java
 *	����һ��ѭ�����飬��������������� SUM >= 0����ô��Ȼ�������������ҵ���ôһ��Ԫ�أ����������Ԫ�س�����������һȦ���ܱ�֤�ۼӺ�һֱ�ǳ��ڷǸ�״̬��
 *  Created on: 2016��5��8��
 *      Author: liuyan
 */

package ly.leetcode.Greedy;

public class Q134GasStation {
	public static void main(String[] args) {
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0; // ������
		int sum = 0; // ����ʣ��
		int start = 0; // ��ʼ��
		for (int i = 0; i < gas.length; i++) {
			total += (gas[i] - cost[i]);	// һֱ�������еġ���+֧��
			if (sum < 0) { // ������գ�����һ����ʼ
				sum = gas[i] - cost[i];
				start = i;
			} else {	// �����䲻Ϊ�գ�������ۻ������ʣ��
				sum += (gas[i] - cost[i]);
			}
		}
		// ����һ��ѭ�����飬��������������� SUM >=
		// 0����ô��Ȼ�������������ҵ���ôһ��Ԫ�أ����������Ԫ�س�����������һȦ���ܱ�֤�ۼӺ�һֱ�ǳ��ڷǸ�״̬��
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
				start = i + 1;	//����һ����ʼ
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
