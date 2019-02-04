package com.javaweb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        if(s.length() == 0){
            return false;
        }

        Boolean[] temp = new Boolean[s.length() + 1];
        Arrays.fill(temp,false);
        for(int i = 0; i < s.length() + 1; i ++) {
            for(int j = 0; j < i; j ++){
                for (String word : wordDict) {
                    temp[i] = temp[i] || (s.substring(0, i).equals(word) || (temp[j] == true && s.substring(j, i).equals(word)));
            }
            }
        }
        return temp[s.length()];
    }

    public static void main(String[] args){
        String s = "leco";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("le");
        wordDict.add("co");
        WordBreak word = new WordBreak();
        System.out.println(word.wordBreak(s,wordDict));

    }

}
