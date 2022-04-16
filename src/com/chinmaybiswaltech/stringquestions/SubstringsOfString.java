package com.chinmaybiswaltech.stringquestions;

public class SubstringsOfString {

    public static void main(String[] args) {
        String str= "Name";
        findSubstrings(str);
        findSubstringsProgram2(str);
    }

    private static void findSubstrings(String str){
        if (str.length()== 0){
            return;
        }
        for (int i=0;i<str.length();i++){
            for (int j =i+1; j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }

    private static void findSubstringsProgram2(String str){
        if (str.length()== 0){
            return;
        }
        for (int i=0;i<str.length();i++){
            String subStr="";
            for (int j =i; j<str.length();j++){
                subStr+=str.charAt(j);
                System.out.print(subStr+" ");
            }
        }
    }
}
