package BinarySearch;

import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        int result = aggressiveCows(arr, 4);
        System.out.println(result);
    }
    public static int aggressiveCows(int []stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n -1] - stalls[0];
        while(start <= end){
            int mid = start + (end - start)/2;
            if (canWePlace(stalls, mid, k) == true) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return end;
    }

    private static boolean canWePlace(int[] stalls, int mid, int k) {
    }

    public static int max(int[] stalls){
        int n = stalls.length;
        Arrays.sort(stalls);
        return stalls[n-1];
    }
}
