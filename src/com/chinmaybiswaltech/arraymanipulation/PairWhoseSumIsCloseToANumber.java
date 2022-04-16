package com.chinmaybiswaltech.arraymanipulation;

import java.util.Arrays;

public class PairWhoseSumIsCloseToANumber {

    public static void main(String[] args) {
        int[] arr ={-25, -10, 1,5,10,20};
        Arrays.sort(arr);
        int x = 100;
        int low = 0;
        int high = arr.length-1;

        int minLeft = low;
        int minRight = high;
        int minimumSum = Integer.MAX_VALUE;
        while(low<high){
            int sum = Math.abs(arr[low]+arr[high]-x);
            if(sum<minimumSum){
                minimumSum= sum;
                minLeft = low;
                minRight = high;
            }
            if(arr[low]+arr[high]<x){
                low++;
            }else{
                high--;
            }
        }
        System.out.println("Pair whose sum is close to 100 are "+ arr[minLeft] + " "+arr[minRight]);
    }
}
