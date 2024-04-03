package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        boolean result = rotateString(s,goal);
        System.out.println(result);
    }

    private static boolean rotateString(String s, String goal) {
        if(s.length() == goal.length()){
            String ans = s.concat(s);
            if(ans.contains(goal)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
