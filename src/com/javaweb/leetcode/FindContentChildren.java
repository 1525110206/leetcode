package com.javaweb.algorithm;

import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {

        if(g.length == 0){
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int res = 0;
        while(m > 0 && n > 0){
            if(s[n - 1] >= g [m - 1]){
                res ++;
                m --;
                n --;
            }else{
                m--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        FindContentChildren find = new FindContentChildren();
        System.out.println(find.findContentChildren(g,s));
    }

}
