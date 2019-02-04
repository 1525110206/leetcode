package com.javaweb.algorithm;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null){
            return res;
        }
        queue.add(root);
        while(! queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            while(count > 0){
                TreeNode p = queue.poll();
                list.add(p.val);
                if(p.left != null){
                    queue.add(p.left);
                }
                if(p.right != null){
                    queue.add(p.right);
                }
                count--;
            }
            res.add(list);
        }
        for(int i = 0 , j = res.size() - 1; j > (res.size()-1)/2;  i++, j--){
            List<Integer> temp = res.get(i);
            res.set(i, res.get(j));
            res.set(j, temp);
        }
     return res;
    }
}
