package Leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Reverseword {
    public static void main(String[] args) {
        System.out.println(reverseWord("This is joy"));
    }

    public static String reverseWord(String st){
        String[] strings = st.split(" ");
        Collections.reverse(Arrays.asList(strings));
        return String.join(" ",strings);
    }
}
