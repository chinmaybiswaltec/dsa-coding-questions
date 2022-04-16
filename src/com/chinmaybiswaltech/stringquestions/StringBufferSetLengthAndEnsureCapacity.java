package com.chinmaybiswaltech.stringquestions;

public class StringBufferSetLengthAndEnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);// Hello
        sb.setLength(3);
        // It trims the characters and keeps only up to length 3
        System.out.println(sb);//Hel
        sb.setLength(10);
        // It appends null chars to the blank spaces
        System.out.println(sb);//Hel    (null characters added)
        //Current capacity
        System.out.println(sb.capacity());//21
        sb.ensureCapacity(25);
        //Current capacity
        System.out.println(sb.capacity());//44
    }
}
