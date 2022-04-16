package com.chinmaybiswaltech.stringquestions;

public class RotationalPalindrome {
    public static void main(String[] args) {
        String str = "ccccf";
        System.out.println(isRotationalPalindrome(str));//true
        String str2 = "cccf";
        System.out.println(isRotationalPalindrome(str2));//false
    }

    private static boolean isRotationalPalindrome(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            rotateCharArray(arr);
            if (checkPalindrome(arr)) {
                System.out.println("Given String is a rotational palindrome");
                return true;
            }
        }
        return false;
    }

    private static char[] rotateCharArray(char[] arr) {
        char start = arr[0];
        int i = 0;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = start;
        return arr;
    }

    private static boolean checkPalindrome(char[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}



