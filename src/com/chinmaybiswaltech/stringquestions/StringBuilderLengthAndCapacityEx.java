package com.chinmaybiswaltech.stringquestions;

public class StringBuilderLengthAndCapacityEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

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
