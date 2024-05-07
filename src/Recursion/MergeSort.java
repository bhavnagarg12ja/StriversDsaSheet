package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 2, 8, 3, 1, 6, 5};
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (high - low) / 2 + low;
        mergeSort(arr, temp, low, mid);
        mergeSort(arr, temp, mid + 1, high);
        merge(arr, temp, low, mid, high);
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int left = low;
        int right = mid + 1;
        int k = low;
        while (left <= mid && right <= high) {
            if (temp[left] <= temp[right]) {
                arr[k++] = temp[left++];
            } else {
                arr[k++] = temp[right++];
            }
        }
        while (left <= mid) {
            arr[k++] = temp[left++];
        }
    }
}
