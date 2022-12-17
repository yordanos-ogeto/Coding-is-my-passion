package Leetcode;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr ={2,2,1};
        int [] arr1 ={4,1,2,1,2};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber(arr1));

    }
    public static int singleNumber(int[] nums){
        //return Arrays.stream(nums).reduce(0,(x,y)->x^y);
    int number=0;
    for (int elem:nums){
        number^=elem;
    }
    return number;
    }
}
