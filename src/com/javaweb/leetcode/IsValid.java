package com.javaweb.algorithm;

import java.util.Random;
import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char topchar = stack.pop();
                if (c == ')' && topchar != '(') {
                    return false;
                }
                if (c == ']' && topchar != '[') {
                    return false;
                }
                if (c == '}' && topchar != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String[] args){
        IsValid i = new IsValid();
        String s = "[{}]";
        boolean b = i.isValid(s);
        System.out.println(b);

        Random random = new Random();

        for(int j = 0; j < 100; j ++){
            System.out.println(random.nextInt(9)+1);
        }




    }

}
