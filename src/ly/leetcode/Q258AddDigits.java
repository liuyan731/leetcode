/*
 * AddDigits.java
 *
 *  Created on: 2016Äê4ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

import java.util.ArrayList;

public class Q258AddDigits {
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	public static int addDigits(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		while (num > 0) {
			list.add(num % 10);
			num = num / 10;
		}

		int temp = 0;
		for (Integer integer : list) {
			temp = temp + integer;
		}
		
		int ret = 0;
		
		if(temp < 10) {
			return temp;
		} else {
			return addDigits(temp);
		}
	}
}
