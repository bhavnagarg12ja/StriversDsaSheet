package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int previous = 0;
        for(int i = s.length()-1; i >= 0;i--){
            int value = map.get(s.charAt(i));
            if(value < previous){
                result -= value;
            }else{
                result += value;
            }
            previous = value;
        }
        return result;
    }
}

