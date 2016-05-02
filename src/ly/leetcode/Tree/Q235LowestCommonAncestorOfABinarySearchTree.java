/*
 * Q235LowestCommonAncestorOfABinarySearchTree.java
 *
 *  Created on: 2016Äê5ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q235LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while ((root.val - p.val) * (root.val - q.val) > 0) {
			root = p.val < root.val ? root.left : root.right;
		}
		return root;
	}
}
