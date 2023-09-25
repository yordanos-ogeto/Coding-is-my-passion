package Leetcode;

import java.util.HashMap;
import java.util.Map;
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        //{2,2},{1,1}
        singleNum(arr);
    }
    public static void singleNum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " **");
                ;
            }
        }
    }
}
