package com.javaweb.algorithm;

public class ReverseString {
    public String reverseString(String s) {
        StringBuilder a = new StringBuilder();
        char[] temp = s.toCharArray();
        for(int i = temp.length - 1; i >= 0; i--){
            a.append(temp[i]);
        }
        return a.toString();
    }

}
