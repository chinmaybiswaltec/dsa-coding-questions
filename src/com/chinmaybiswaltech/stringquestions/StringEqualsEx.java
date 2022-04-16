package com.chinmaybiswaltech.stringquestions;

public class StringEqualsEx {

    public static void main(String[] args) {
        // Created in string constant pool
        String s1 = "abc";

        // String object is created in Heap
        String s2 = new String("abc");

        //== compares object location
        System.out.println(s1==s2); // false
        //equals compares object content
        System.out.println(s1.equals(s2));// true
    }
}
