package com.chinmaybiswaltech.stringquestions;

public class MethodsOfStringEx3 {

    public static void main(String[] args) {
        String s1 ="Rahul Dravid is epitome of elegance and consistency ";
        String[] splitArr = s1.split(" ");
        for (int i =0; i<splitArr.length; i++){
            System.out.print(splitArr[i]+" ");
        }
        //Rahul Dravid is epitome of elegance and consistency
        // Size of
        //Using limit splitArr is 8
        String[] splitArr2 = s1.split(" ",3);

        for (int i =0; i<splitArr2.length; i++){
            System.out.println(splitArr2[i]);
        }
        // Rahul splitArr2[0]
        // Dravid splitArr2[1]
        //is epitome of elegance and consistency splitArr2[3]
        //size of splitArr2 is 3
    }
}
