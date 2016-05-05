/*
 * Q104MaximumDepthofBinaryTree.java
 *
 *  Created on: 2016Äê4ÔÂ19ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

public class Q104MaximumDepthofBinaryTree {
	public static void main(String[] args) {
		
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			int l = 1;
			int r = 1;
			l = l + maxDepth(root.left);
			r = r + maxDepth(root.right);
			return Math.max(l, r);
		}
    }
}
