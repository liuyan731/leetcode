/*
 * Q110BalancedBinaryTree.java
 *
 *  Created on: 2016��5��2��
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q110BalancedBinaryTree {
	//����һ������������������ȣ�Ȼ�����߶Ȳ����1�򷵻�false
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		} else if(Math.abs(treeHeight(root.left) - treeHeight(root.right)) > 1) {
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public int treeHeight(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			return Math.max(treeHeight(root.left), treeHeight(root.right)) + 1;
		}
	}
	
	//��������ÿ�α�������ȵ�ʱ���ж�һ���Ƿ����ֲ�ƽ��������������֣�ֱ��return -1
	public boolean isBlanced2(TreeNode root) {
		if(root == null) {
			return true;
		} else {
			return getDepth(root) != -1;
		}
	}
	
	public int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
			return -1;
		} else {
			return Math.max(left, right) + 1;
		}
	}
}
