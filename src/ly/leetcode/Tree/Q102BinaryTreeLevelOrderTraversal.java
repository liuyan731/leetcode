/*
 * Q102BinaryTreeLevelOrderTraversal.java
 *
 *  Created on: 2016Äê5ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q102BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> ret = new ArrayList<>();
		if (root == null) {
			return ret;
		} else {
			queue.offer(root);
			while (!queue.isEmpty()) {
				List<Integer> list = new ArrayList<>();
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.poll();
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
					list.add(node.val);
				}
				ret.add(list);
			}
		}
		return ret;
	}
}
