package com.javaweb.algorithm;

import javax.sound.midi.Soundbank;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int temps = s.length();
        int tempt = t.length();
        int i = 0;
        int j = 0;
        if(s == "" && t != ""){
            return true;
        }

        while(i < temps && j < tempt){
            if(s.charAt(i) == t.charAt(j)){
                i ++;
                j ++;
            }else{
                j ++;
            }
            if(i == temps - 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String s = "b";
        String t = "t";
        IsSubsequence is = new IsSubsequence();


        System.out.println(is.isSubsequence(s,t));
    }

}
