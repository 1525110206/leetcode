package com.javaweb.algorithm;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class LevelOrder {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0){

                TreeNode p = queue.peek();
                list.add(p.val);
                if(p.left != null){
                    queue.add(p.left);
                }
                if(p.right != null){
                    queue.add(p.right);
                }
                queue.poll();
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
