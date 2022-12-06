package MiuSampleExam;

import java.util.Arrays;

public class MedianSortedArray {
    public static void main(String[] args) {
        int[] n1 ={1,3};
        int [] n2 = {2,4};
        System.out.println(medianSortedArray(n1,n2));
    }
    public static double median(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int length = nums1.length + nums2.length;
        int middle = length/2;
        int m1 = 0, m2= 0;
        int i=0, j=0, k=0;

        while(i<=middle){
            m1 = m2;
            if(j<m && k<n){
                if(nums1[j] < nums2[k]){
                    m2 = nums1[j];
                    j++;
                }else{
                    m2=nums2[k];
                    k++;
                }
            }else if (j<m){
                m2 = nums1[j];
                j++;
            }else{
                m2 = nums2[k];
                k++;
            }
            i++;
        }

        double med = (length % 2 == 0)? (m1+m2)/2.0 : m2;
        return med;
    }


    public static  double medianSortedArray(int[]num1,int[]num2){
        int n = num1.length;
        int m = num2.length;
        int []num3 = new int[n+m];
        int i=0,j=0,k=0;

        while(i<n&&j<m){
            if(num1[i]<num2[j]){
                num3[k]=num1[i];
                i++;
            }
         else   { num3[k]=num2[j];
         j++;}
            k++;
        }
        while (i<n){
            num3[k]=num1[i];
            i++;
            k++;
        }
        while (j<m){
            num3[k]=num2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(num3));
        if(num3.length%2!=0){
            return num3[num3.length/2];
        }
        else{
            int leng = num3.length/2;
            System.out.println(leng);
            double q = num3[leng];
            double p = num3[leng-1];
            return (p+q)/2;
        }

    }
}
