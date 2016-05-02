/*
 * Q100SameTree.java
 *
 *  Created on: 2016��5��2��
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
		//�������ȫ��Ȳ�������ת��������ȵ��������ת����ͬ�������Ҫ�ٿ���
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
