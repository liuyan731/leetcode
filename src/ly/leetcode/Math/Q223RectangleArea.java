/*
 * Q223RectangleArea.java
 *
 *  Created on: 2016Äê4ÔÂ25ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Math;

public class Q223RectangleArea {
	public static void main(String[] args) {
		System.out.println(3<<2);
		System.out.println(computeArea(-2, -2, 2, 2, -4, -4, 3, 3));
	}
	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int area1 = (C - A) * (D - B);
		int area2 = (G - E) * (H - F);
		int area3 = 0;
		if(A > G || B > H || D < F || C < E) {
			return area1 + area2;
		} else {
			int l = 0;
			if(E > A) {
				l = Math.min(C - E, G - E);
			} else {
				l = Math.min(C - A, G - A);
			}
			int h = 0;
			if(D > H) {
				h = Math.min(H - B, H - F);
			} else {
				h = Math.min(D - B, D - F);
			}
			area3 = l * h;
			return area1 + area2 - area3;
		}
	}
}
