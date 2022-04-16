package com.chinmaybiswaltech.arraymanipulation;

public class SecondHighestElementInArray {
    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 20, 30, 40};
        System.out.println("Second Highest Element Is "+findSecondHighest(arr));
    }

    private static int findSecondHighest(int[] arr){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>highest){
                secondHighest = highest;
                highest = arr[i];
            }else if(arr[i]> secondHighest && arr[i] != highest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }
}
