package Leetcode;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isValidPalindrome(s1));
        System.out.println(isValidPalindrome(s2));
    }

    public static boolean isValidPalindrome(String s){
        String str = s.replaceAll("[^A-Za-z]","").toLowerCase();
        String reverse = new StringBuffer(str).reverse().toString();
        return str.equals(reverse);
    }
}
