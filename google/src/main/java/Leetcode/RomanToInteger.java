package Leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String st = "LVIII";
        String st1 = "MCMXCIV";
        System.out.println(romanToInt(st));
        System.out.println(romanToInt(st1));

    }

    public static int romanToInt(String st) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = map.get(st.charAt(st.length() - 1));
        for (int i = st.length() - 2; i >= 0; i--) {
            if (map.get(st.charAt(i) )< map.get(st.charAt(i + 1))) {
                sum -= map.get(st.charAt(i));
            }
        else{
                sum += map.get(st.charAt(i));}
        }
            return sum;
        }
    }
