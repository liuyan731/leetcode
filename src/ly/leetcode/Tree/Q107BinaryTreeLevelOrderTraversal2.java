/*
 * Q107BinaryTreeLevelOrderTraversal2.java
 *
 *  Created on: 2016Äê5ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q107BinaryTreeLevelOrderTraversal2 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<>();
		if(root == null) {
			return ret;
		} else {
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			while(!queue.isEmpty()) {
				List<Integer> list = new ArrayList<>();
				int queueSize = queue.size();
				for (int i = 0; i < queueSize; i++) {
					TreeNode node = queue.poll();
					list.add(node.val);
					if(node.left != null) {
						queue.offer(node.left);
					}
					if(node.right != null) {
						queue.offer(node.right);
					}
				}
				ret.add(list);
			}
		}
		List<List<Integer>> newRet = new ArrayList<>();
		for (int i = ret.size() - 1; i >= 0 ; i--) {
			newRet.add(ret.get(i));
		}
		return newRet;
	}
}
