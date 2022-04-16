package com.chinmaybiswaltech.stringquestions;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfAStringMethod1 {
    public static void main(String[] args) {
      //Test: 1 str= abc
        System.out.println(getPermutations("abc"));
    }

    private static Set<String> getPermutations(String str){
        Set<String> perms = new HashSet<>();
        if(str == null){
            return null;
        }
        if (str.length() ==0){
            perms.add("");
            return perms;
        }
        char firstChar = str.charAt(0);
        String restSubStr = str.substring(1);
        Set<String> words = getPermutations(restSubStr);
        for(String s: words){
            for(int i =0;i<=s.length();i++){
                perms.add(insertCharAt(i,s,firstChar));
            }
        }
        return perms;
    }

    private static String insertCharAt(int posToInsert, String permutedString, char initialChar){
        String begin = permutedString.substring(0,posToInsert);
        String end = permutedString.substring(posToInsert);
        return begin+initialChar+end;
    }
}
