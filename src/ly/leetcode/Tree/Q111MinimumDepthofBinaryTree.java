/*
 * Q111MinimumDepthofBinaryTree.java
 *
 *  Created on: 2016Äê4ÔÂ19ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q111MinimumDepthofBinaryTree {
	public static void main(String[] args) {
		
	}
	
	public int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		} else if(root.left == null && root.right == null) {
			return 1;
		} else {
			int l = 1;
			int r = 1;
			if(root.left != null) {
				l = l + minDepth(root.left);
			} else {
				l = 1000000;
			}
			if(root.right != null) {
				r = r + minDepth(root.right);
			} else {
				r = 1000000;
			}
			return Math.min(l, r);
		}
    }
}
