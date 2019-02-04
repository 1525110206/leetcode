package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Postorder {

    private class Node{
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(! stack.isEmpty()){
            Node cur = stack.peek();
            if(cur.children.size() == 0 ){
                res.add(cur.val);
                stack.pop();
            }else{
                for(int i = cur.children.size() - 1; i >= 0; i --){
                    stack.push(cur.children.get(i));
                }
            }
        }
        return res;

    }

}
