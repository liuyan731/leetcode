/*
 * Q119PascalTriangle2.java
 *
 *  Created on: 2016Äê5ÔÂ21ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Math;

import java.util.ArrayList;
import java.util.List;

public class Q119PascalTriangle2 {
	
	public static void main(String[] args) {
		List<Integer> list = getRow(1);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> ret = new ArrayList<>();
		rowIndex = rowIndex + 1;
		if (rowIndex <= 2) {
			for (int i = 0; i < rowIndex; i++) {
				ret.add(1);
			}
			return ret;
		} else {
			List<Integer> forwardRet = getRow(rowIndex - 1);
			ret.add(1);
			for (int i = 1; i < forwardRet.size(); i++) {
				ret.add(forwardRet.get(i) + forwardRet.get(i - 1));
			}
			ret.add(1);
			return ret;
		}
	}
}
