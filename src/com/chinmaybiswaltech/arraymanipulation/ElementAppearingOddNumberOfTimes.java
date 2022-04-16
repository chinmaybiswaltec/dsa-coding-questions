package com.chinmaybiswaltech.arraymanipulation;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingOddNumberOfTimes {

    public static void main(String[] args) {
        int[] arr = {20,10,20,30,10};
        System.out.println("Number appearing odd number of times "+numberOccurringOddTimes(arr));
    }

    private static int numberOccurringOddTimes(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<arr.length;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for (Integer i: map.keySet()){
            if (map.get(i)%2==1)
                return i;
        }
        return -1;
    }
}
