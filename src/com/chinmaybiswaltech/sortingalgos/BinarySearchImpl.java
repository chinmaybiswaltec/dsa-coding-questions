package com.chinmaybiswaltech.sortingalgos;

public class BinarySearchImpl {

    public static void main(String[] args) {
     int[] arr = {29,45,76,89,2};
        System.out.println("Found the element at the index "+binarySearch(arr, 100));
        System.out.println("Found the element at the index "+binarySearch(arr, 76));
    }

    private static int binarySearch(int[] arr, int element){
        if (arr.length==0)
            return  -1;
        int low =0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(element < arr[mid]){
                high = mid-1;
            }else if(element > arr[mid]){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
