package com.chinmaybiswaltech.stringquestions;

import java.sql.SQLOutput;
import java.util.SortedSet;

public class StringObjectInstantiation {
    public static void main(String[] args) {
        // Using String literal
        String s0= "Dravid";
        System.out.println(s0);// Dravid
        // Using new keyword
        String s1= new String("Rahul");
        System.out.println(s1); // Rahul
        // From char array
        char[] ch = {'W', 'A', 'L', 'L'};
        String s3= new String(ch);
        System.out.println(s3);// WALL
        // From String Buffer
        StringBuffer sb = new StringBuffer();
        sb.append("Consistency");
        String s4= new String(sb);
        System.out.println(s4); //Consistency
    }
}
