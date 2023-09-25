package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class IntersectionOfArray {
    public static void main(String[] args) {
        int[]arr1={1,2,2,1};
        int[]arr2 ={2,2};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[]arr1,int[]arr2){
        HashSet<Integer> set= new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>();
        for(int i:arr2){
            if(set.contains(i)){
                list.add(i);
            }
        }
        int[] arr3 = new int[list.size()];
        int i=0;
        for(int j:list){
            arr3[i]=j;
            i++;
        }
        return arr3;
    }
}
