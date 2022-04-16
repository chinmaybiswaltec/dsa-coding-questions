package com.chinmaybiswaltech.sortingalgos;

public class SelectionSortImpl {

    public static void main(String[] args) {
        int[] arr = {40, 30, 20, 10};
        System.out.println("Array before sorting");
        print(arr);
        System.out.println("Array after sorting");
        print(selectionSort(arr));
    }

    private static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i< n-1 ;i++){
            int minIndex = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
