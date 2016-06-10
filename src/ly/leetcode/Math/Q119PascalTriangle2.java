/*
 * Q119PascalTriangle2.java
 *	杨辉三角，也对应这二项式系数的问题
 *  Created on: 2016年5月21日
 *      Author: liuyan
 */

package ly.leetcode.Math;

import java.util.ArrayList;
import java.util.List;

public class Q119PascalTriangle2 {

	public static void main(String[] args) {
		List<Integer> list = getRow(4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0)
			return list;

		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
		}
		return list;
	}
	
	
}
