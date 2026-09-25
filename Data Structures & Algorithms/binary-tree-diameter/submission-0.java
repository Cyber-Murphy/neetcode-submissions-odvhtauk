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
    int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // so we will solve this problem using the concept of depth
        depth(root);
        return maxDiameter;
    }
    protected int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);

        maxDiameter=Math.max(maxDiameter,left+right);

        return 1+Math.max(left,right);
    }

}
