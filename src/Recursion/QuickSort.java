package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[]args){
        int[] arr = {7, 4, 2, 8, 3, 1, 6, 5};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = sorting(arr, low, high);
            quickSort(arr, low, partitionIndex-1);   //sort left part
            quickSort(arr, partitionIndex+1, high);  //sort right part
        }
    }
    public static int sorting(int[]arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            //it will find the numbers which are greater than pivot
            while(arr[i] <= pivot && i <= high -1){
                i++;
            }
            //it will find the numbers which are smaller than pivot
            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j){
                swap(arr, i,j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[]array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
