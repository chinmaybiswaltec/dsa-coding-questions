package com.chinmaybiswaltech.arraymanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairWhoseSumIsCloseToANumber {
    public static void main(String[] args) {
        int[] arr= {0,2,8,5,9,1};
        printPairs(arr, 10);
        printPairsUsingHashing(arr, 10);
    }

    private static void printPairsUsingHashing(int[] arr, int x){
        Map<Integer, Integer> pairMap = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            int diff = x-arr[i];
            if(!pairMap.containsKey(arr[i])){
                pairMap.put(Math.abs(diff),arr[i]);
            }else{
                System.out.println(arr[i]+"---"+pairMap.get(arr[i]));
            }

        }
    }


    private static void printPairs(int[] arr, int x){
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            if ( arr[l]+arr[r] == x ){
                System.out.println(arr[l]+"---"+arr[r]);
                l++;
                r--;
            }
            else if(arr[l]+arr[r] < x ){
                l++;
            }else{
                r--;
            }
        }
    }

}
