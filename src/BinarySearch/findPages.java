package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class findPages {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(67);
        list.add(90);
        int result = findPages(list, list.size(), 2);
        System.out.println(result);
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (n < m) {
            return -1;
        }
        int start = Collections.min(arr);
        int end = findMax(arr);
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(isPossible(arr,n,m,mid)){
                result = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }

    public static int findMax(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max += arr.get(i);
        }
        return max;
    }

    public static boolean isPossible(ArrayList<Integer> arr , int n, int m, int mid){
        int students = 1;
        int currentSum = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i)> mid){
                return false;
            }
            if(currentSum + arr.get(i) > mid){
                students++;
                currentSum = arr.get(i);
                if(students > m){
                    return false;
                }
            }else{
                currentSum += arr.get(i);
            }
        }
        return true;
    }
}
