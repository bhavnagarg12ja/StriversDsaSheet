package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceWithSumK {
    public static void main(String[]args){
        int[] nums = {1, 2, 1};
        List<List<Integer>> subsequences = findingSequence(nums,2);
        // Print all subsequences
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    public static List<List<Integer>> findingSequence(int[]nums, int sum){
        List<List<Integer>> subsequences = new ArrayList<>();
        findingSequence(nums, 0, 0, sum, new ArrayList<>(), subsequences);
        return subsequences;
    }

    public static void findingSequence(int[] nums, int index, int s, int sum, List<Integer> current, List<List<Integer>> subSequences) {
        if (index == nums.length) {
            if (s == sum) {
                subSequences.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(nums[index]);
        s += nums[index];
        findingSequence(nums, index + 1, s, sum, current, subSequences);
        current.remove(current.size() - 1); // Backtrack
        s -= nums[index];
        // Exclude current element
        findingSequence(nums, index + 1, s, sum, current, subSequences);
    }
}
