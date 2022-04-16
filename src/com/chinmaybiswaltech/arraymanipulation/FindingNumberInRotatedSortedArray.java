package com.chinmaybiswaltech.arraymanipulation;

public class FindingNumberInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 20, 30, 40};
        int i=findingElementInRotatedSortedArray(arr, 0, arr.length-1, 70);
        System.out.println("Element is found at the index "+i);
    }

    private static int findingElementInRotatedSortedArray(int[] arr, int low, int high, int element) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (element == arr[mid]) {
            return mid;
        }
        else if (arr[low] <= arr[mid]) {
            if (element >= arr[low] && element <= arr[mid]) {
                return findingElementInRotatedSortedArray(arr,low, mid-1, element);
            }else{
               return findingElementInRotatedSortedArray(arr,mid+1, high, element);
            }
        }else{
            if (element >= arr[mid] && element <= arr[high]) {
               return  findingElementInRotatedSortedArray(arr,mid+1, high, element);
            }else{
                return findingElementInRotatedSortedArray(arr,low, mid-1, element);
            }
        }

    }
}
