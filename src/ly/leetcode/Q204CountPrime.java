/*
 * Q204CountPrime.java
 *
 *  Created on: 2016Äê4ÔÂ19ÈÕ
 *      Author: liuyan
 */

package ly.leetcode;

public class Q204CountPrime {
	public static void main(String[] args) {
		System.out.println(countPrimes2(10));
	}
	
	public static int countPrimes(int n) {
//		int dp[] = new int[n + 1];
//		if(n == 0 || n == 1) {
//			return 0;
//		} else {
//			for (int i = 2; i < n; i++) {
//				if(isPrime(i)) {
//					dp[i] = dp[i - 1] + 1;
//				} else {
//					dp[i] = dp[i - 1];
//				}
//			}
//		}
//		return dp[n - 1];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(isPrime(i)) {
				count++;
			} 
		}
		return count;
	}
	
	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static int countPrimes2(int n) {
		boolean[] ret= new boolean[n];
		for (int i = 2; i * i < n; i++) {
			if(!ret[i]) {
				for (int j = i; i * j < n; j++) {
					ret[i * j] = true;
				}
			}
		}
		
		int count = 0;
		for (int i = 2; i < n; i++) {
			if(ret[i] == false) {
				count++;
			}
		}
		return count;
	}
}
