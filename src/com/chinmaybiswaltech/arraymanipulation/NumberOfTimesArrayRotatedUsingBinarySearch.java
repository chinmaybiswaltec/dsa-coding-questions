package com.chinmaybiswaltech.arraymanipulation;

public class NumberOfTimesArrayRotatedUsingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 20, 30, 40};
        System.out.println("Number of times array rotated is " +
                numberOfTimesArrayRotated(arr));
    }

    private static int numberOfTimesArrayRotated(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int pre = mid - 1;
            int next = mid + 1;
            if (arr[mid] <= arr[pre] && arr[mid] <= arr[next]) {
                return mid;
            } else if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }
        return 0;
    }
}
