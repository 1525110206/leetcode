package com.javaweb.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {


    //leetcode155
    List<Integer> stack = null;
    List<Integer> temp = null;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        temp = new ArrayList<>();
    }
    //这一题很巧妙，在push的时候，维护了两个栈，第一个栈是数据栈，没什么特别
    //第二个栈是最小值栈，如果当前push的值比最小值要小，那么就push进这个最小值，
    //如果比这个最小值大，就push进原来的最小值
    //这样的话，万一最小值被pop出去的话，也能够找到第二小的值
    public void push(int x) {
        stack.add(x);
        if(temp.size() == 0){
            temp.add(x);
        } else {
            int min = getMin();
            if(x >= min){
                temp.add(min);
            } else{
                temp.add(x);
            }
        }
    }
    //pop的时候要两个栈同时pop
    public void pop() {
        if(stack.size() == 0){
            throw new IllegalArgumentException("the stack is empty");
        }
        stack.remove(stack.size() - 1);
        temp.remove(temp.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        if(temp.isEmpty()){
            throw new IllegalArgumentException("no min");
        }else{
            return temp.get(temp.size() - 1);
        }
    }


    public static void main(String[] args){
        MinStack min = new MinStack();
        min.push(-2);
        min.push(0);
        min.push(-3);
        System.out.println(min.getMin());
        min.pop();
        System.out.println(min.top());
        System.out.println(min.getMin());

    }

}
