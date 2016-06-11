/*
 * Q144BinaryTreePreorderTraversal.java
 *
 *  Created on: 2016年6月11日
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal1(TreeNode root) { // 非递归
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (root != null) {
			ret.add(root.val);
			if (root.right != null) {
				stack.push(root.right);
			}
			root = root.left;

			if (root == null && !stack.isEmpty()) {
				root = stack.pop();
			}
		}
		return ret;
	}

	public List<Integer> preorderTraversal3(TreeNode root) { // 非递归2
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if(node != null) {
				ret.add(node.val);
				stack.push(node.right);
				stack.push(node.left);
			}
		}
		return ret;
	}

	public List<Integer> preorderTraversal2(TreeNode root) { // 递归
		List<Integer> ret = new ArrayList<>();
		if (root == null) {
			return ret;
		} else {
			if (root.left == null && root.right == null) {
				ret.add(root.val);
			} else {
				ret.add(root.val);
				ret.addAll(preorderTraversal2(root.left));
				ret.addAll(preorderTraversal2(root.right));
			}
			return ret;
		}
	}
}
