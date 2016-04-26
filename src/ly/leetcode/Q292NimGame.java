/*
 * Q292NimGame.java
 *
 *  Created on: 2016Äê4ÔÂ3ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q292NimGame {
	public static void main(String[] args) {
		System.out.println(canWinNim(5));
	}

	public static boolean canWinNim(int n) {
		return !(n % 4 == 0);
	}
}
