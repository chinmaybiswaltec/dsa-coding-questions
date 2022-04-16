package com.chinmaybiswaltech.sortingalgos;

public class InsertionSortImpl {

    public static void main(String[] args) {
        int[] arr = {40, 30, 20, 10};
        System.out.println("Array before sorting");
        print(arr);
        System.out.println("Array after sorting");
        print(insertionSort(arr));
    }

    private static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i =1; i< n ;i++){
            int key = arr[i];
            int j = i-1;
            while( j >=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
