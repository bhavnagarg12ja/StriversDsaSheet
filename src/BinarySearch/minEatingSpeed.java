package BinarySearch;

public class minEatingSpeed {
    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
        System.out.println(ans);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int n = piles.length;
        int end = maxNumber(piles);

        while(start <= end){
            int mid = start + (end - start)/2;
            int hours = numberOfHours(piles, mid);
            if(hours <= h){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static int maxNumber(int[] piles){
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Integer.max(max, piles[i]);
        }
        return max;
    }
    public static int numberOfHours(int[] piles, int h) {
        int n = piles.length;
        int totalHours = 0;
        for(int i = 0; i < n; i++){
            totalHours += Math.ceil((double)(piles[i]) / (double)(h));
        }
        return totalHours;
    }
}
