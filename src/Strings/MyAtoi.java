package Strings;

public class MyAtoi {
    public static void main(String[] args) {
        String s = "42";
        int result = myAtoi(s);
        System.out.println(result);
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if(s==null || s.length() == 0){
            return 0;
        }
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true; // negative decided
        }
        double result = 0;
        int startIndex = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            startIndex++;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            int digit = s.charAt(i)-'0';
            result = result*10 + digit;
        }
        if(isNegative){
            result = -result;
        }
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}
