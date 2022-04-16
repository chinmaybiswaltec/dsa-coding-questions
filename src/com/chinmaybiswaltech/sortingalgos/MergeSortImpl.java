package com.chinmaybiswaltech.sortingalgos;

public class MergeSortImpl {

    static  int  arr[]={20,5,30,19,0,1,55};

    public static void main(String args[])
    {

        System.out.println("Array before sorting:");
        printArray(arr,0,arr.length-1);
        mergeSort(0,arr.length-1);
        System.out.println("Array After sorting:");
        printArray(arr,0,arr.length-1);

    }

    public static void mergeSort(int st,int end)
    {
        int mid=(st+end)/2;
        if(st<end)
        {
            mergeSort(st,mid);
            mergeSort(mid+1,end);
            merge(st,mid,end);
        }

    }

    private static void merge(int start, int mid, int end) {
        int[] temp=new int[arr.length];
        int tempIndex=start;

        System.out.print("Before Merging:  ");
        printArray(arr,start,end);

        int startIndex=start;
        int midIndex=mid+1;


        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                temp[tempIndex++]=arr[startIndex++];
            }
            else
            {
                temp[tempIndex++]=arr[midIndex++];
            }
        }

        while(startIndex<=mid)
        {
            temp[tempIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            temp[tempIndex++]=arr[midIndex++];
        }


        for (int i = start; i <=end; i++) {
            arr[i]=temp[i];
        }

        System.out.print("After merging:   ");
        printArray(temp,start,end);
        System.out.println();
    }

    public static void printArray(int arr[],int start,int end)
    {
        for (int i = start; i <=end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
