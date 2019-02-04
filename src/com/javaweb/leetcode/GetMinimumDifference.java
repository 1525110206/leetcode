package com.javaweb.algorithm;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class GetMinimumDifference {

    private class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

    }


    Stack<Integer> stack = new Stack<>();
    public int getMinimumDifference(TreeNode root) {
        MidSearch(root);
        int temp = 65536;
        int val1 = stack.pop();
        while(!(stack.isEmpty())){
            int val2 = stack.pop();
            temp = (val1 - val2) < temp? (val1 - val2):temp;
            val1=val2;
        }
        return temp;

    }

    private void MidSearch(TreeNode root) {
        if(root == null){
            return;
        }
        MidSearch(root.left);
        stack.push(root.val);
        MidSearch(root.right);
    }
}
