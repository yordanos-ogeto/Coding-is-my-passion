import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }


    public static int[] twoSum(int[] arr, int target) {
        int[] newArr = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (!map.containsKey(diff)) {
                map.put(arr[i], i);
            } else {
                newArr[0] = map.get(diff);
                newArr[1] = i;

            }
        }
        return newArr;
    }
}
        Coding-is-my-passion