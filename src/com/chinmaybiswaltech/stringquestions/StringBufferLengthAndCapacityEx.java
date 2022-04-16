package com.chinmaybiswaltech.stringquestions;

public class StringBufferLengthAndCapacityEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // This method returns length of the string
        System.out.println(sb.length());//5

        //This method returns capacity of the string
        System.out.println(sb.capacity());//21

        sb.append("Rahul Dravid is epitome of consistency and perseverance");

        // Length of string after appending a longer string
        System.out.println(sb.length());//60

        // Increased capacity after we appended a longer string
        System.out.println(sb.capacity());//60
    }
}
