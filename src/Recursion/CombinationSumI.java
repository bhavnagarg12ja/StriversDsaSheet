package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    public static void main(String[]args){
        int[] arr = {2,3,6,7};
        List<List<Integer>> combinations =  combinationSum(arr, 7);
        for(List<Integer> combination : combinations){
            System.out.println(combination);
        }
    }
    public static List<List<Integer>> combinationSum(int[]arr, int target){
        List<List<Integer>> combinations = new ArrayList<>();
        findingCombination(arr, 0, target, new ArrayList<>(), combinations);
        return combinations;
    }
    public static void findingCombination(int[]arr, int index, int target, List<Integer> current, List<List<Integer>> combinations){
        if (index == arr.length) {
            if (target == 0) {
                combinations.add(new ArrayList<>(current));
            }
            return;
        }
        if(arr[index] <= target){
            current.add(arr[index]);
            findingCombination(arr,index, target-arr[index], current, combinations);
            current.remove(current.size() - 1); // Backtrack
        }
        findingCombination(arr,index+1, target, current, combinations);
    }
}
