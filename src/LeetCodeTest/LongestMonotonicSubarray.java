package LeetCodeTest;

public class LongestMonotonicSubarray {
    public static void main(String[]args){
        int[] arr = {1,4,3,3,2};
        int result = longestMonotonicSubarray(arr);
        System.out.println(result);
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int increaseCount = 1;
        int decreaseCount = 1;
        int maxCount = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                increaseCount++;
                decreaseCount = 1;
                if(increaseCount > maxCount){
                    maxCount = increaseCount;
                }
            }else if(nums[i] > nums[i+1]){
                decreaseCount++;
                increaseCount = 1;
                if(decreaseCount > maxCount){
                    maxCount = decreaseCount;
                }
            } else if(nums[i] == nums[i+1]){
                increaseCount = 1;
                decreaseCount = 1;
            }
        }
        return maxCount;
    }
}
