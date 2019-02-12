package com.javaweb.leetcode;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String s = "+-*/";

        for(int i = 0; i < tokens.length; i ++){
            if(s.contains(tokens[i])){
                if(tokens[i].equals("+")) {
                    int num1;int num2;
                    int sum;
                    //获取栈顶元素并且弹出。
                    num1=stack.pop();
                    num2=stack.pop();
                    sum=num1+num2;
                    //把和压入到栈中
                    stack.push(sum);
                }
                if(tokens[i].equals("-")) {
                    //如果是减，要考虑哪个数字减去哪个(除)要考虑到
                    //根据这个题目意思是我这里的num2-num1;
                    int num1;int num2;
                    int sum;
                    //获取栈顶元素并且弹出。
                    num1=stack.pop();
                    num2=stack.pop();
                    sum=num2-num1;
                    //把和压入到栈中
                    stack.push(sum);
                }
                if(tokens[i].equals("*")) {
                    //如果是减，要考虑哪个数字减去哪个(除)要考虑到
                    //根据这个题目意思是我这里的num2-num1;
                    int num1;int num2;
                    int sum;
                    //获取栈顶元素并且弹出。
                    num1=stack.pop();
                    num2=stack.pop();
                    sum=num2*num1;
                    //把和压入到栈中
                    stack.push(sum);
                }
                if(tokens[i].equals("/")) {
                    int num1;int num2;
                    int sum;
                    //获取栈顶元素并且弹出。
                    num1=stack.pop();
                    num2=stack.pop();
                    sum=num2/num1;
                    //把和压入到栈中
                    stack.push(sum);
                }
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        String[] tokens = {"2","1","+","3","*",};
        EvalRPN e = new EvalRPN();
        System.out.println(e.evalRPN(tokens));
    }
}
