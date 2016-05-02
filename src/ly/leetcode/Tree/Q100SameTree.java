/*
 * Q100SameTree.java
 *
 *  Created on: 2016年5月2日
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q100SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) {
			return false;
		}
		//这里的完全相等不包含反转后两树相等的情况，反转后相同的情况需要再考虑
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
