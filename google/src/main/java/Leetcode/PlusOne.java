package Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        System.out.println(Arrays.toString(plus(arr)));
    }
    public static int[] plus(int[] digit){
        //99=>100
        //9=>0;
        for (int i = digit.length-1; i >=0 ; i--) {
            if(digit[i]<=8){
                digit[i]=digit[i]+1;
                return digit;
            }
            else{
                digit[i]=0;
            }
        }
        int [] arr=new int[digit.length+1];
             arr[0]=1;

        return arr;
    }
}
