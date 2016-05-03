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
	
	public int minDepth1(TreeNode root) {
		if(root == null) {
			return 0;
		} else if(root.left == null && root.right == null) {
			return 1;
		} else {
			int l = 1;
			int r = 1;
			if(root.left != null) {
				l = l + minDepth1(root.left);
			} else {
				l = 1000000;
			}
			if(root.right != null) {
				r = r + minDepth1(root.right);
			} else {
				r = 1000000;
			}
			return Math.min(l, r);
		}
    }

	public int minDepth2(TreeNode root) {
		int ret = 0;
		if(root == null) {
			return 0;
		} else if(root.left != null && root.right != null) {
			int left = minDepth2(root.left) + 1;
			int right = minDepth2(root.right) + 1;
			ret = Math.min(left, right);
		} else if(root.left == null) {
			ret = minDepth2(root.right) + 1; 
		} else if (root.right == null) {
			ret = minDepth2(root.left) + 1;
		}
		return ret;
	}
}
