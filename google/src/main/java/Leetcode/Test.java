package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        int[] arr =     {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
                nums[j++] = nums[i];
        }
        System.out.println(Arrays.toString(nums)+"*************");
        System.out.println(j+"*********");
        while(j<nums.length){
            nums[j++]=0;
        }
    }
    public static int reverse(int num) {
        int result = 0;
        while (num != 0) {
            int remainder = num % 10;
            result = result * 10 + remainder;
            num /= 10;
        }
        return result;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int k = 0;
        int[] arr = new int[list.size()];
        for (int p : list) {
            arr[k] = p;
            k++;
        }
        return arr;
    }

}
