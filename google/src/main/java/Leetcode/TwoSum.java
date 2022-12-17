package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums ={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));

    }
    public static int[] twoSum(int[] nums,int target){
        int[] reuslt = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int difference = target-nums[i];
        if(map.containsKey(difference)){
            reuslt[0]=i;
            reuslt[1]=map.get(difference);
            return reuslt;
        }
        map.put(nums[i],i);
        }
        return reuslt;
    }
}
