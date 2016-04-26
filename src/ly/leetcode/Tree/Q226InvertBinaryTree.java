/*
 * Q226InvertBinaryTree.java
 *
 *  Created on: 2016Äê4ÔÂ20ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q226InvertBinaryTree {
	public static void main(String[] args) {

	}

	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		} else {
			TreeNode rTmp = root.right;
			TreeNode lTmp = root.left;
			root.right = invertTree(lTmp);
			root.left = invertTree(rTmp);
		}
		return root;
	}
}
