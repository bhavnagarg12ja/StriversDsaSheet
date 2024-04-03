package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[]args){
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        String string1 = new String(array1);
        String string2 = new String(array2);
        if(string1.equals(string2)){
            return true;
        }
        return false;
    }
}
