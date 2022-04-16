package com.chinmaybiswaltech.stringquestions;

public class ReverseStringWithRecursionMethod1 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str,new StringBuilder()));

    }
    private static String reverse(String str, StringBuilder sb){
        if(str.length()==1){
            sb.append(str.charAt(0));
            return  sb.toString();
        }
        sb.append(str.charAt(str.length()-1));
        return reverse(str.substring(0,str.length()-1),sb);
    }
}
