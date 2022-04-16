package com.chinmaybiswaltech.stringquestions;

public class CommonSubstring {
    public static void main(String[] args) {
        System.out.println(isCommonSubstring("abc","bce"));
    }

    static boolean isCommonSubstring(String s1, String s2){
        boolean[] booleans = new boolean[26];
        for (int i=0;i<s1.length();i++){
            booleans[s1.charAt(i)-'a']=true;
        }
        for (int i=0;i<s2.length();i++){
            if (booleans[s2.charAt(i)-'a']==true)
                return true;
        }
        return false;
    }
}
