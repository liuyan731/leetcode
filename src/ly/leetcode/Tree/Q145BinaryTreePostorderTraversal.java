/*
 * Q145BinaryTreePostorderTraversal.java
 *
 *  Created on: 2016年6月11日
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q145BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal1(TreeNode root) { // 非递归
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			if(node != null){
				stack.push(node);
				ret.add(0, node.val); // Reverse the process of preorder
				node = node.right; // Reverse the process of preorder
			} else {
				TreeNode tmp = stack.pop();
				node = tmp.left;// Reverse the process of preorder
			}
		}
		return ret;
	}
	
	public List<Integer> postorderTraversal(TreeNode root) { // 递归
		List<Integer> ret = new ArrayList<>();
		if(root == null) {
			return ret;
		} else {
			if(root.left == null && root.right == null) {
				ret.add(root.val);
			} else {
				ret.addAll(postorderTraversal(root.left));
				ret.addAll(postorderTraversal(root.right));
				ret.add(root.val);
			}
			return ret;
		}
	}
}
