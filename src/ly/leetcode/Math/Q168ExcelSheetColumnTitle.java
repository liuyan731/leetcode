package ly.leetcode.Math;
/*
 * Excel2.java
 *
 *  Created on: 2016��4��30��
 *      Author: liuyan
 */

public class Q168ExcelSheetColumnTitle {
	public static void main(String[] args) {
		convertToTitle(52);
		System.out.println();
		System.out.println(convertToTitle2(52));
		
	}
	
	public static void convertToTitle(int n) {	//�ݹ�
		if(n <= 26) {
			System.out.print((char)(n + 'A' - 1));
		} else {
			convertToTitle((n - 1) / 26);
			if(n %26 == 0) {
				System.out.print('Z');
			} else {
				System.out.print((char)(n % 26 + 'A' - 1));
			}
		}
    }
	
	public static String convertToTitle2(int n) { //�ǵݹ�
		StringBuilder sb = new StringBuilder("");
		while(n >= 26) {
			if(n % 26 == 0) {
				sb.append('Z');
			} else {
				sb.append((char)(n % 26 + 'A' - 1));
			}
			n = (n - 1) / 26;
		}
		if(n >= 1) {
			sb.append((char)(n + 'A' - 1));
		}
		return sb.reverse().toString();
	}
}
