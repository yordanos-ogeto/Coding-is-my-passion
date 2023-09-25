package Leetcode;

import java.util.Arrays;
public class RotateArray {
    private int length;
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums1 = {-1};
        //5.6.7
        System.out.println("My result" + Arrays.toString(rotateArray(nums, 3)));
        System.out.println("My result" + Arrays.toString(rotateArray(nums1, 3))+"**");
    }
    public static int[] rotate(int[] nums, int k) {
        if(nums.length==1)return nums;
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = k + 1; i < nums.length; i++) {
            temp[j] = nums[i];
            j++;
        }
        j = k;
        for (int i = 0; i <= k; i++) {
            temp[j] = nums[i];
            j++;
        }
        return temp;
    }

    public static int[] rotate2(int[] nums, int k) {
        int[] temp1 = new int[nums.length];
        //int j =0;
        for (int i = 0; i < nums.length; i++) {
            ///1,2,3,4,5,6,7
            temp1[(k + i) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp1[i];
        }
        System.out.println("**********" + Arrays.toString(temp1));
        return nums; }
    public static int[] rotateArray(int[] nums, int k) {
        if(nums.length==1||k==0)return nums;
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums) + " *");
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums) + " **");
        reverse(nums, k, nums.length - 1);
        return nums;
    }
    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
