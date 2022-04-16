package com.chinmaybiswaltech.arraymanipulation;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingOddNumberOfTimesUsingXOR {

    public static void main(String[] args) {
        int[] arr = {20,10,20,30,10};
        System.out.println("Number appearing odd number of times "+numberOccurringOddTimes(arr));
    }

    private static int numberOccurringOddTimes(int[] arr){
        int odd=0;
        for (int i =0;i<arr.length;i++){
           odd = odd ^ arr[i];
        }
        return odd;
    }
}
