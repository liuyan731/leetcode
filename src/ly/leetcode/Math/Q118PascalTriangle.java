/*
 * Q118PascalTriangle.java
 *	杨辉三角，也对应这二项式系数的问题
 *  Created on: 2016年5月20日
 *      Author: liuyan
 */

package ly.leetcode.Math;

import java.util.ArrayList;
import java.util.List;

public class Q118PascalTriangle {
	public static void main(String[] args) {
		generate(0);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<>();
		if (numRows == 0) {
			return ret;
		}
		List<Integer> firstRow = new ArrayList<>(1);
		List<Integer> secondRow = new ArrayList<>(2);
		firstRow.add(1);
		secondRow.add(1);
		secondRow.add(1);
		ret.add(firstRow);
		if(numRows== 1) {
			return ret;
		}
		ret.add(secondRow);
		if(numRows == 2) {
			return ret;
		}
		
		for (int i = 2; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			row.add(1);
			for (int j = 1; j < i; j++) {
				int tmp = ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j);
				row.add(tmp);
			}
			row.add(1);
			ret.add(row);
		}
		return ret;
	}
}
