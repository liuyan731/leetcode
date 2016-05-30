/*
 * Q347TopKFrequentElements1.java
 *
 *  Created on: 2016��5��30��
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
		// ʹ��java�Դ���PriorityQueue����ʵ�֣�PriorityQueue�����ȶ��У�ʵ������һ��С����
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue()); // �ı�����ķ�����ʹ��value��Ϊ�ж�
		pq.addAll(map.entrySet());
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ret.add(pq.poll().getKey());//ÿ�ζ���ȥȡ�Ѷ���Ԫ��
		}
		return ret;
	}
}
