package com.chinmaybiswaltech.stringquestions;

public class StringConstantPoolEx {

    public static void main(String[] args) {
        // Created in string constant pool
        String s1 = "abc";
        // Reference to string literal abc is returned and assigned to s2
        String s2 = "abc";
        // String object is created in Heap
        String s3 = new String("abc");
        // s1 and s2 points to same literal in SCP
        System.out.println(s1==s2);// true
        // S2 points to SCP whereas s3 points to an object location in Heap
        System.out.println(s1==s3);// false;
        //s4 is created in Heap
        String s4 = new String("def");
        // Adds the literal "def" to String constant pool
        String s5 = s4.intern();
        // s6 points to already present "def" literal in SCP
        String s6 = "def";
        // S4 in Heap and s5 in SCP
        System.out.println(s4==s5);// false
        // s5 and s6 points to same literal in SCP
        System.out.println(s5==s6);// true
    }
}
