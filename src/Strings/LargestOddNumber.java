package Strings;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s = "3542";
        String result = largestOddNumber(s);
        System.out.println(result);
    }
    public static String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1; i>=0; i--){
            char c = num.charAt(i);
            if(Long.valueOf(c) % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
