/*
 * Q036ValidSudoku.java
 *
 *  Created on: 2016Äê6ÔÂ13ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.HashTable;

import java.util.HashSet;

public class Q036ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> rowSet = new HashSet<>();
			HashSet<Character> columnSet = new HashSet<>();
			HashSet<Character> cubeSet = new HashSet<>();
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
					return false;
				}
				if (board[j][i] != '.' && !columnSet.add(board[j][i])) {
					return false;
				}
				int rowIndex = 3 * (i / 3);
				int columnIndex = 3 * (i % 3);
				if(board[rowIndex + j / 3][columnIndex + j % 3] != '.' && !cubeSet.add(board[rowIndex + j / 3][columnIndex + j % 3])) {
					return false;
				}
			}
		}
		return true;
	}
}
