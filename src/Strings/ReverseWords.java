package Strings;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = reverseWords(s);
        System.out.println(result);
    }
    public static String reverseWords(String s) {
        String words[]=s.split(" +");
        StringBuilder reversed=new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            reversed.append(" ");
        }
        return reversed.toString().trim();
    }

}
