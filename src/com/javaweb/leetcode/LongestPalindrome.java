package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            int len = search(s, i, i);
            int len2 = search(s, i, i + 1);
            int res = Math.max(len, len2);
            if(res > (end - start + 1)){
                start = i- (res-1)/2;
                end = i + res/2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int search(String s, int left, int right){
        int L = left;
        int R = right;
        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //list.add(1);
        }
    }
}
