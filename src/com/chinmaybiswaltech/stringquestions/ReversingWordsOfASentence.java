package com.chinmaybiswaltech.stringquestions;

public class ReversingWordsOfASentence {
    public static void main(String[] args) {
        String str = "I love java";
        char[] ch = reverseWords(str);
        System.out.println(ch);
    }

    private static char[] reverseWords(String str){
        int length = str.length();
        char[] inputArr = str.toCharArray();
        char[] outputArr = new char[length];
        int spaceIndex =0;
        int outputArrIndex =0;
        int subStringLength =0;

       for(int i = length-1; i>=0;i--){
           if(i==0){
             while(inputArr[i] != ' '){
                 outputArr[outputArrIndex++]=inputArr[i++];
             }
             return outputArr;
           }
           if(inputArr[i]==' ') {
               spaceIndex = i;
               subStringLength = length - 1 - spaceIndex;
               while (outputArrIndex < subStringLength) {
                   outputArr[outputArrIndex++] = inputArr[++spaceIndex];
               }
               outputArr[outputArrIndex++] = ' ';
           }
       }
        return outputArr;
    }
}
