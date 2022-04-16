package com.chinmaybiswaltech.arraymanipulation;

import java.util.Arrays;

public class PairWhoseSumCloseToZero {

    public static void main(String[] args) {
        int[] arr ={-25, -10, 1,5,10,20};
        Arrays.sort(arr);
        int low =0;
        int high = arr.length-1;
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        int min_i=low, min_j=high;
        while(low<high){

            sum = arr[low]+arr[high];
            if(Math.abs(sum)<Math.abs(minSum)){
                minSum=sum;
                min_i=low;
                min_j=high;
            }
            if (sum<0){
                low++;
            }else{
                high--;
            }
        }
        System.out.println("Two elements whose sum are minimum "+min_i +" and "+min_j);
    }
}
