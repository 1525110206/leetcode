package com.javaweb.algorithm;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){
            this.val = val;
        }
    }
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        InorderTraversal(root);
        return list.get(k-1);
    }
    private List<Integer> InorderTraversal(TreeNode root){
        if(root == null){
            return list;
        }
        InorderTraversal(root.left);
        list.add(root.val);
        InorderTraversal(root.right);
        return list;
    }
}
