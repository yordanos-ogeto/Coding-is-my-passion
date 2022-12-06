package Leetcode;

import java.util.Arrays;
public class RemoveDuplicate {
    public static void main(String[] args) {
       int [] nums ={0,0,1,1,1,2,2,3,3,4};
      //  System.out.println(Arrays.toString(remove(nums)));
        System.out.println(remove(nums));
    }
    public static int remove(int[] nums){
        int k =1;
        for (int i = 1; i <nums.length-1 ; i++) {
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;
    }
}
