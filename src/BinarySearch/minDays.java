package BinarySearch;

public class minDays {
    public static void main(String[] args) {
        int[] intervals = {7, 7, 7, 7, 12, 7, 7};
        int result = minDays(intervals, 2, 3);
        System.out.println(result);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int start = 1;
        int end = maxDay(bloomDay);
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (bouquetPossible(bloomDay, mid, k, m)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int maxDay(int[] bloomDay) {
        int maxDay = Integer.MIN_VALUE;
        int n = bloomDay.length;
        for (int i = 0; i < n; i++) {
            maxDay = Math.max(maxDay, bloomDay[i]);
        }
        return maxDay;
    }

    public static boolean bouquetPossible(int[] bloomDay, int mid, int k, int m) {
        int bouquetCount = 0;
        int flowerCount = 0;
        //find the maximum:
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                flowerCount++;
                if (flowerCount == k) {
                    bouquetCount++;
                    flowerCount = 0;
                }
            } else {
                flowerCount = 0;
            }
        }
        return bouquetCount >= m;
    }

}
