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
        printingOnlyOne(nums, 0, 0, sum, new ArrayList<>(), subsequences);
        int result = countingSubsequences(nums, 0, 0, sum, new ArrayList<>(), subsequences);
        System.out.println(result);
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
    //printing one subsequence
    public static boolean printingOnlyOne(int[] nums, int index, int s, int sum, List<Integer> current, List<List<Integer>> subSequences) {
        if (index == nums.length) {
            if (s == sum) {
                subSequences.add(new ArrayList<>(current));
                return true;
            }
            return false;

        }
        current.add(nums[index]);
        s += nums[index];
        if(printingOnlyOne(nums, index + 1, s, sum, current, subSequences)== true){
           return true;
        }
        current.remove(current.size() - 1); // Backtrack
        s -= nums[index];
        // Exclude current element
        if(printingOnlyOne(nums, index + 1, s, sum, current, subSequences)== true){
            return true;
        }
        return false;
    }

    //counting the number of subsequence with sum k;
    public static int countingSubsequences(int[] nums, int index, int s, int sum, List<Integer> current, List<List<Integer>> subSequences) {
        if (index == nums.length) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }
        current.add(nums[index]);
        s += nums[index];
        int left = countingSubsequences(nums, index + 1, s, sum, current, subSequences);
        current.remove(current.size() - 1); // Backtrack
        s -= nums[index];
        // Exclude current element
        int right = countingSubsequences(nums, index + 1, s, sum, current, subSequences);

        return left+right;
    }
}
