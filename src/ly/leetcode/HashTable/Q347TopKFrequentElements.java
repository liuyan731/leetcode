/*
 * Q347TopKFrequentElements.java
 *
 *  Created on: 2016��5��13��
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

	// ʹ��HashMap+�󶥶���ʵ�֣�ȡ�Ѷ������k��Ԫ�أ�
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
		}
		// ʹ��java�Դ���PriorityQueue����ʵ�֣�PriorityQueue�����ȶ��У�ʵ������һ��С����
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue()); // �ı�����ķ�����ʹ��value��Ϊ�ж�
		pq.addAll(map.entrySet());
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ret.add(pq.poll().getKey());// ÿ�ζ���ȥȡ�Ѷ���Ԫ�أ�ÿ����һ��Ԫ�ض������µ�����
		}
		return ret;
	}

	// ʹ��Ͱ�����˼��
	public static List<Integer> topKFrequent2(int[] nums, int k) {
		List<Integer>[] bucket = new ArrayList[nums.length + 1]; // ����һ����������飬��Ҫ��Ϊ�˽��һ��Ƶ�����ֶ�ε����
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
