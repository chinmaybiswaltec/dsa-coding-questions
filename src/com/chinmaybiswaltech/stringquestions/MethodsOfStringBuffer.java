package com.chinmaybiswaltech.stringquestions;

public class MethodsOfStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // Appends the string to the StringBuffer character sequence
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
