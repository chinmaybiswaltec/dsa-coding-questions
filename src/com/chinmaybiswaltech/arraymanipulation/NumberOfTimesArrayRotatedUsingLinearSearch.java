package com.chinmaybiswaltech.arraymanipulation;

public class NumberOfTimesArrayRotatedUsingLinearSearch {

    public static void main(String[] args) {
        int[] arr ={50,60,70,20,30,40};
        System.out.println("Number of times array rotated is "+
                numberOfTimesArrayRotated(arr));
    }

    private static int numberOfTimesArrayRotated(int[] arr){
        int index = -1;
        int smallest = arr[0];
        for (int i=1; i< arr.length;i++){
            if (arr[i]< smallest){
                smallest=arr[i];
                index=i;
            }
        }
        return index;
    }
}
