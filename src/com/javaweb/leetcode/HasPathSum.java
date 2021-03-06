package com.javaweb.algorithm;

public class HasPathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == sum;
        }
        if(hasPathSum(root.left, sum-root.val)){
            return true;
        }
        if(hasPathSum(root.right, sum - root.val)){
            return true;
        }
        return false;
    }

}
