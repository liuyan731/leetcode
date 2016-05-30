/*
 * Q347TopKFrequentElements1.java
 *
 *  Created on: 2016年5月30日
 *      Author: liuyan
 */

package ly.leetcode.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347TopKFrequentElements1 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
		}
		// 使用java自带的PriorityQueue类来实现，PriorityQueue是优先队列，实际上是一个小顶堆
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue()); // 改变排序的方法，使用value作为判断
		pq.addAll(map.entrySet());
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ret.add(pq.poll().getKey());//每次都会去取堆顶的元素
		}
		return ret;
	}
}
