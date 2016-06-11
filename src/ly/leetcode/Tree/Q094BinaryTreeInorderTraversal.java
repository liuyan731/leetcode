/*
 * Q094BinaryTreeInorderTraversal.java
 *
 *  Created on: 2016年6月11日
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q094BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal2(TreeNode root) { // 非递归
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			ret.add(node.val);
			node = node.right;
		}
		return ret;
	}

	public List<Integer> inorderTraversal(TreeNode root) { // 递归
		List<Integer> ret = new ArrayList<>();
		if (root == null) {
			return ret;
		} else {
			if (root.left == null && root.right == null) {
				ret.add(root.val);
			} else {
				ret.addAll(inorderTraversal(root.left));
				ret.add(root.val);
				ret.addAll(inorderTraversal(root.right));
			}
			return ret;
		}
	}
}
