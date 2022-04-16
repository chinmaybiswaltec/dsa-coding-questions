package com.chinmaybiswaltech.sortingalgos;

public class QuickSortImpl {

    static int arr[] = {20, 5, 30, 19, 0, 1, 55};

    public static void main(String args[]) {

        System.out.println("Array before sorting:");
        printArray(arr, 0, arr.length - 1);
        quickSort(0, arr.length - 1);
        System.out.println("Array After sorting:");
        printArray(arr, 0, arr.length - 1);

    }

    public static void quickSort(int st, int end) {
        int i = st;
        int j = end;

        int pivot = arr[st + (end - st) / 2];
        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (st < j)
            quickSort(st, j);
        if (i < end)
            quickSort(i, end);
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[], int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
