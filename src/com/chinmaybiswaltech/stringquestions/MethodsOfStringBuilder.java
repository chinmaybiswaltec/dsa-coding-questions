package com.chinmaybiswaltech.stringquestions;

public class MethodsOfStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Appends the string to the StringBuilder character sequence
        sb.append("Rahul");
        System.out.println(sb);// Rahul
        sb.insert(3, "WALL");
        System.out.println(sb);//RahWALLul
        sb.replace(3,7, "wall");
        System.out.println(sb);//Rahwallul
        sb.delete(3,7);
        System.out.println(sb);//Rahul
    }
}
