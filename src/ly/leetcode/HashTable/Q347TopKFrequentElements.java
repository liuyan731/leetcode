/*
 * Q347TopKFrequentElements.java
 *
 *  Created on: 2016年5月13日
 *      Author: liuyan
 */

package ly.leetcode.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3, 4, 4 };
		List<Integer> list = topKFrequent2(nums, 2);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	// 使用HashMap+大顶堆来实现（取堆顶的最大k个元素）
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
		}
		// 使用java自带的PriorityQueue类来实现，PriorityQueue是优先队列，实际上是一个小顶堆
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue()); // 改变排序的方法，使用value作为判断
		pq.addAll(map.entrySet());
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ret.add(pq.poll().getKey());// 每次都会去取堆顶的元素，每弹出一个元素都会重新调整堆
		}
		return ret;
	}

	// 使用桶排序的思想
	public static List<Integer> topKFrequent2(int[] nums, int k) {
		List<Integer>[] bucket = new ArrayList[nums.length + 1]; // 定义一个链表的数组，主要是为了解决一个频数出现多次的情况
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
		}
		for (int key : map.keySet()) {
			int frequency = map.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(key);
		}

		List<Integer> ret = new ArrayList<>();

		for (int i = bucket.length - 1; i >= 0 && ret.size() < k; i--) {
			if (bucket[i] != null) {
				ret.addAll(bucket[i]);
			}
		}
		return ret;
	}
}
