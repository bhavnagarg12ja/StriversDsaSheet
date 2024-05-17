package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<List<Integer>> subsequences = generateSubsequences(nums);
        // Print all subsequences
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static List<List<Integer>> generateSubsequences(int[] nums) {
        List<List<Integer>> subsequences = new ArrayList<>();
        generateSubsequences(nums, 0, new ArrayList<>(), subsequences);
        return subsequences;

    }

    private static void generateSubsequences(int[] nums, int index, List<Integer> current, List<List<Integer>> subsequences) {
        if (index == nums.length) {
            subsequences.add(new ArrayList<>(current));
            return;
        }
        // Include current element
        current.add(nums[index]);
        generateSubsequences(nums, index + 1, current, subsequences);
        current.remove(current.size() - 1); // Backtrack
        // Exclude current element
        generateSubsequences(nums, index + 1, current, subsequences);
    }
}
