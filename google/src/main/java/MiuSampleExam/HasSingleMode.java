package MiuSampleExam;

import java.util.HashMap;
import java.util.Map;

public class HasSingleMode {
    public static void main(String[] args) {
        int[] arr = {1, -29, 8, 5, -29, 6};
        int[] arr2 = {7, 1, 2, 1, 2, 1, 7, 4, 2, 7,};
        // hasSingleMode(arr);
        System.out.println(hasSingleMode(arr2));
        System.out.println(hasSingleMode(arr));

    }

    public static int hasSingleMode(int[] arr) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (max < map.get(i)) {
                max = map.get(i);
            }

        }
        int temp = max;
        for (int i : map.values()) {
          if(i==temp){
              max-=temp;
          }
        if(max==0)
            return 1;
        }
        return 0;
    }
}