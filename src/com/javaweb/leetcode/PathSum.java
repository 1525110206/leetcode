package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        search(res, list, root, sum);
        return res;
    }

    private void search(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum ){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null ){
            if(root.val == sum){
                list.add(root.val);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                return;
            }
        }
        list.add(root.val);
        search(res, list, root.left, sum - root.val);
        search(res, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args){
        TreeNode root = null;
        PathSum path = new PathSum();
        System.out.println(path.pathSum(root,1));
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
