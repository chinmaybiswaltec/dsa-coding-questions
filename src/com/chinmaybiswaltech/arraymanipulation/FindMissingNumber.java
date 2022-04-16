package com.chinmaybiswaltech.arraymanipulation;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {10,6,8,5,9,2,4,3,7};
        int n = arr.length+1;
        int sum = 10*(10+1)/2;
        int realSum = 0;
        for (int i=0;i<arr.length;i++){
            realSum= realSum +arr[i];
        }
        int missingNumber = sum-realSum;
        System.out.println("Missing number is "+ missingNumber);
    }
}
