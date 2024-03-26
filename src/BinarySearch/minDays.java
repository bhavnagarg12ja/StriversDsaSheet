package BinarySearch;

public class minDays {
    public static void main(String[] args) {
        int[] intervals = {7, 7, 7, 7, 12, 7, 7};
        int result = minDays(intervals, 2, 3);
        System.out.println(result);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        long totalFlowersRequired = (long) m * k;
        int n = bloomDay.length;
        if (totalFlowersRequired <= n) {
            int start = 1;
            int end = maxDay(bloomDay);
            while (start <= end) {
                int mid = start + (start - end) / 2;




            }
           return start;
        }
        return -1;
    }

    public static int maxDay(int[] bloomDay) {
        int maxDay = Integer.MIN_VALUE;
        int n = bloomDay.length;
        for (int i = 0; i < n; i++) {
            maxDay = Math.max(maxDay, bloomDay[i]);
        }
        return maxDay;
    }

//    public static boolean isPossible(int[] bloomDay, int mid, int m, int k){
//
//    }

}
