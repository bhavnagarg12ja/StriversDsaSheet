package LeetCodeTest;

import java.util.Arrays;


public class MinOperationsToMakeMedianK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 5};
        int k = 4;
        long result = minOperationsToMakeMedianK(arr, k);
        System.out.println(result);
    }

    public static long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = n / 2;
        if (nums[median] == k) {
            return 0;
        } else if (nums[median] > k) {
            long operations = 0;
            for (int i = median; i >= 0; i--) {
                if (nums[i] >= k)
                    operations += nums[i] - k;
                else
                    break;
            }
            return operations;
        } else {
            long operations = 0;
            for (int i = median; i < n; i++) {
                if (nums[i] <= k)
                    operations += k - nums[i];
                else
                    break;
            }
            return operations;
        }
    }
}
