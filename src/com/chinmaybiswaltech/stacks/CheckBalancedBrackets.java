package com.chinmaybiswaltech.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBalancedBrackets {

    public static void main(String[] args) {
        String str1 = "{{([])}}";
        String str2 = "{({[])}}";
        System.out.println(isBalanced(str1));// true
    }

    private static boolean isBalanced(String str){
        Deque<Character> deque = new ArrayDeque<>();
        for (int i=0; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch=='{' || ch == '(' || ch == '['){
                deque.push(ch);
                continue;
            }
            if (deque.isEmpty()){
                return  false;
            }
            char atTop ;
            switch (ch){
                case ')':
                    atTop = deque.pop();
                    if (atTop == '{' || atTop == '[')
                        return false;
                    break;
                case '}':
                    atTop = deque.pop();
                    if (atTop == '(' || atTop == '[')
                        return false;
                    break;
                case ']':
                    atTop = deque.pop();
                    if (atTop == '{' || atTop == '(')
                        return false;
                    break;
            }
        }
        return deque.isEmpty();
    }
}
