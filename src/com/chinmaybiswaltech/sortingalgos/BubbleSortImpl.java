package com.chinmaybiswaltech.sortingalgos;

public class BubbleSortImpl {
    public static void main(String[] args) {
        int[] arr = {40, 30, 20, 10};
        System.out.println("Array before sorting");
        print(arr);
        System.out.println("Array after sorting");
        print(bubbleSort(arr));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped =true;
                }
            }
            if (!isSwapped){
                return arr;
            }
        }
        return arr;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
