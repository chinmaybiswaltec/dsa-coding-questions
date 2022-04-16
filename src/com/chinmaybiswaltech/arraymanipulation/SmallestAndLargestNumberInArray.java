package com.chinmaybiswaltech.arraymanipulation;

public class SmallestAndLargestNumberInArray {

    public static void main(String[] args) {
        int[] arr = {0,20,1,50,8,99};
        int smallest= arr[0];
        int largest = arr[0];

        for(int i =1; i< arr.length; i++){
            if (arr[i]>largest)
                largest = arr[i];
            if (arr[i]<smallest)
                smallest = arr[i];
        }
        System.out.println("Smallest element in the array is :"+smallest);
        System.out.println("Largest element in the array is :"+largest);
    }
}
