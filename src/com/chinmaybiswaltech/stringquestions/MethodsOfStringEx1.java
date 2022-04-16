package com.chinmaybiswaltech.stringquestions;

public class MethodsOfStringEx1 {

    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 = "Hi";
        String s3 = "hi";
        String s4 = "";
        System.out.println(s1.equals(s2));// false
        System.out.println(s2.equalsIgnoreCase(s3));//true
        System.out.println(s2.compareTo(s3)); //-32
        System.out.println(s2.compareToIgnoreCase(s3));//0
        System.out.println(s1.contains("lo"));//true
        System.out.println(s1.contains("do"));//false
        System.out.println(s1.length());//5
        System.out.println(s4.length());//0
    }
}
