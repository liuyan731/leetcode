/*
 * Q112PathSum.java
 *
 *  Created on: 2016��5��2��
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q112PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null && sum == root.val) {
			return true;
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
	}
}
