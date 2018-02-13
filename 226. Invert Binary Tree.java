/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if ((root == null) || ((root.left == null) && (root.right == null))) {
            return root;
        }
        TreeNode tnode = root.left;
        root.left = root.right;
        root.right = tnode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
