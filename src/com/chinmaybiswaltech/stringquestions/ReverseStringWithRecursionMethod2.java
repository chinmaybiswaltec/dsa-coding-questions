package com.chinmaybiswaltech.stringquestions;

public class ReverseStringWithRecursionMethod2 {
    public static void main(String[] args) {
        String str = "hello";
       reverse(str);
    }
    private static void reverse(String str){
        if (str.length()==1){
            System.out.println(str);
        }else{
            reverse(str.substring(1,str.length()));
            System.out.print(str.substring(0,1));
        }
    }
}

