package Strings;

public class MaxDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println(result);
    }
    public static int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
                maxCount = Math.max(maxCount, count);
            }else if(c == ')'){
                count--;
            }
        }
        return maxCount;
    }
}
