/*
 * Q101SymmetricTree.java
 *
 *  Created on: 2016年5月2日
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.Stack;

public class Q101SymmetricTree {
	//方法一：使用递归方式
	public boolean isSymmetric(TreeNode root) {
		return symmetricHelper(root, root);
	}

	public boolean symmetricHelper(TreeNode node1, TreeNode node2) {
		if (node1 == null || node2 == null) {
			return node1 == node2;
		} else if (node1.val != node2.val) {
			return false;
		} else {
			return symmetricHelper(node1.left, node2.right) && symmetricHelper(node1.right, node2.left);
		}
	}
	
	//方法二：使用非递归方式,使用栈(Leetcode解题报告...)
	public boolean isSymmetric2(TreeNode root) {
		if(root == null) {
			return true;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode left, right;
		if(root.left != null) {
			if(root.right == null) {
				return false;
			}
			stack.push(root.left);
			stack.push(root.right);
		} else if(root.right != null) {
			return false;
		}
		
		while(!stack.empty()) {
			if(stack.size() % 2 != 0) {
				return false;
			} else {
				right = stack.pop();
				left = stack.pop();
				if(right.val != left.val) {
					return false;
				}
				
				if(left.left != null) {
					if(right.right == null) {
						return false;
					} else {
						stack.push(left.left);
						stack.push(right.right);
					}
				} else if(right.right != null) {
					return false;
				}
				
				if(left.right != null) {
					if(right.left == null) {
						return false;
					} else {
						stack.push(left.right);
						stack.push(right.left);
					}
				} else if(right.left != null) {
					return false;
				}
			}
		}
		return true;
	}
}
