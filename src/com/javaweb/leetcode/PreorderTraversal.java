package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
         TreeNode(int x) {
             val = x;
         }
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }


}
