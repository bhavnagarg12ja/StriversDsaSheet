package BinarySearch;

public class smallestDivisor {
    public static void main(String[]arg){
        int [] arr = {44,22,33,11,1};
        int result = smallestDivisor(arr, 5);
        System.out.println(result);
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold){
            return -1;
        }
        int start = 1;
        int end = max(nums);
        while(start <= end){
            int mid = start + (end - start)/2;
            if (sumByDivisor(nums, mid) <= threshold) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int max(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public static int sumByDivisor(int[] nums, int mid) {
        int n = nums.length;
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(nums[i]) / (double)(mid));
        }
        return sum;
    }
}
