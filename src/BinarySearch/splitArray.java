package BinarySearch;

public class splitArray {
    public static void main(String[]args){
         int[] nums = {7,2,5,10,8};
         int result = splitArray(nums,2);
         System.out.println(result);
    }
    public static int splitArray(int[]nums , int k){
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }
        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(nums, mid, k)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static boolean isPossible(int nums[], int mid, int k){
        int sum = 0;
        int numOfSubarrays = 1;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            if (sum > mid) {
                numOfSubarrays ++;
                sum = nums[i];
            }
        }

        return numOfSubarrays <= k;
    }
}
