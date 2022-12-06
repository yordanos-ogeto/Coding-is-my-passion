package MiuSampleExam;

import java.util.Arrays;

public class FillArray
{
    public static void main(String[] args) {
int[] arr1 = {1,2,3,5, 9, 12,-2,-1};
        System.out.println(Arrays.toString(fill(arr1,3,10)));


    }

    public static int[] fill(int[] arr,int k, int  n){
        if(k<=0 || n<=0)return null;
        int arr_2[] = new int [n];
        int i =0;
        for (int j = 0; j < n; j++) {

        arr_2[j]=arr[i];
        i++;

        if(i==k) {
            i = 0;
        }
        }

        return arr_2;
    }
}
