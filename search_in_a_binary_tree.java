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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null || root.val == val) return root;

        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);

        while (!nodes.empty()) {
            TreeNode currNode = nodes.pop();
            if (currNode.val == val) return currNode;
            if (currNode.left != null) nodes.push(currNode.left);
            if (currNode.right != null) nodes.push(currNode.right);
        }

        /** OPTIMAL CODE
        This is a binary tree, LEFT < RIGHT
        if (val < root.val) searchBST(root.left, val);
        if (val > root.val) searchBST(root.right, val);
        */

        return null;
        
    }
}
