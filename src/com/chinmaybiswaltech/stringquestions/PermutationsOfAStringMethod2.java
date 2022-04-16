package com.chinmaybiswaltech.stringquestions;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfAStringMethod2 {
    public static void main(String[] args) {
      //Test: 1 str= abc
        getPermutations("abc","");
        //Test: 1 str= abcde
        getPermutations("abcde","");
    }

    private static void getPermutations(String str, String ans){
        if (str.length() == 0){
            System.out.print(ans+" ");
        }
        boolean[] alpha = new boolean[26];
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            String restOfString = str.substring(0,i)+str.substring(i+1);
            // To get distinct values
            if (alpha[ch-'a'] == false){
                getPermutations(restOfString,ans+ch);
            }
            alpha[ch-'a'] = true;
        }

    }
}
