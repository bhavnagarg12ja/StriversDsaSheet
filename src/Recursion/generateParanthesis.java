package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static void main(String[]args){
        int n = 3;
        List<String> subsequences = generateParenthesis(n);
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        parenthesis(list,"",0,0,n);
        return list;
    }
    public static void parenthesis(List<String>list, String str, int open, int close, int max){
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        if(open<max){
            parenthesis(list, str+"(", open+1, close, max);
        }
        if(close<open){
            parenthesis(list, str+")", open, close+1, max);
        }
    }
}
