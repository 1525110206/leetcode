package com.javaweb.algorithm;

public class MinDepth {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right) + 1;
        }
        if(root.right == null){
            return minDepth(root.left) + 1;
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left = new TreeNode(20);


        MinDepth m = new MinDepth();
        m.minDepth(root);

    }


}



