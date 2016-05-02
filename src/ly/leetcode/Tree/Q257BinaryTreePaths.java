/*
 * Q257BinaryTreePaths.java
 *
 *  Created on: 2016Äê5ÔÂ2ÈÕ
 *      Author: liuyan
 */

package ly.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class Q257BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		helper(root, "");
		return list;
	}

	List<String> list = new ArrayList<>();

	public void helper(TreeNode root, String path) {
		if(root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list.add(path + root.val);
		}
		if(root.left != null) {
			helper(root.left, path + root.val + "->");
		} 
		if(root.right != null) {
			helper(root.right, path + root.val + "->");
		}
	}
}
