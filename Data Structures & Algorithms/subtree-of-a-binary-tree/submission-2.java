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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null || subRoot==null){
            return false;
        }
        String a=preorder(root);
        String b=preorder(subRoot);

        return a.contains(b);
    }
    String preorder(TreeNode root){
        if(root==null){
            return "null";
        }
        StringBuilder sb=new StringBuilder();
        sb.append(root.val);
        sb.append(preorder(root.left));
        sb.append(preorder(root.right));

        return sb.toString();
    }
}
