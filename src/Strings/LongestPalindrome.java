package Strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
    public static String longestPalindrome(String s) {
        int currLen = 0, maxLen = 0;
        int n = s.length();
        String longestPalindrome = "";
        if (n <= 1) {
            return s;
        }
        //even
        for (int i = 0; i < n; i++) {
            int left = i, right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            currLen = (right - 1) - (left + 1) + 1;
            if (currLen > maxLen) {
                maxLen = currLen;
                longestPalindrome = s.substring(left + 1, right);
            }
        }
        //odd
        for (int i = 1; i < n - 1; i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            currLen = (right - 1) - (left + 1) + 1;
            if (currLen > maxLen) {
                maxLen = currLen;
                longestPalindrome = s.substring(left + 1, right);
            }
        }
        if (longestPalindrome.isEmpty()) {
            return s.substring(0, 1);
        }
        return longestPalindrome;
    }
}
