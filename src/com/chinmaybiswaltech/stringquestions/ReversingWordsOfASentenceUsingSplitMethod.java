package com.chinmaybiswaltech.stringquestions;

public class ReversingWordsOfASentenceUsingSplitMethod {
    public static void main(String[] args) {
        String str = "No one wins a war";
        String[] arr = reverseWords(str);
        for(int i=0;i< arr.length;i++){
            if(i != arr.length-1){
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(arr[i]);
            }
        }
    }
    private static String[] reverseWords(String str){
        String[] strArr = str.split(" ");
        for(int i =0, j= strArr.length-1;i !=j;i++,j--){
            String temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
        }
        return strArr;
    }
}
