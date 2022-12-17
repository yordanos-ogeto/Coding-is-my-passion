package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(3));
    }

    public static String intToRoman(int num){
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        StringBuilder st = new StringBuilder();
        for (Map.Entry<String ,Integer>entry:map.entrySet()) {
            while (num>=entry.getValue()){
                num=num-entry.getValue();
                st.append(entry.getKey());
            }

        }
        return st.toString();

    }
}
