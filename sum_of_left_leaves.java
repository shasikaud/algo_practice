/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int total = 0;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);

        while(!nodes.empty()) {
            TreeNode currNode = nodes.pop();
            if (currNode.left != null) {
                if (currNode.left.left == null && currNode.left.right == null) {
                    total += currNode.left.val;
                }
                nodes.push(currNode.left);
            }
            if (currNode.right != null) nodes.push(currNode.right);
        }

        return total;
    }
}
