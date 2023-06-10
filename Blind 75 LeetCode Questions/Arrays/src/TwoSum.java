import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }
public static int[] twoSum(int num[], int target){
    int pointerA=0;
    int pointerB=num.length-1;
    while (pointerA<=pointerB){
        int sum = num[pointerA]+num[pointerB];
        if(sum>target){
            pointerB-=1;
        } else if (sum<target) {
            pointerA+=1;

        }
        else {
            return new int[]{pointerA+1,pointerB+1};
        }
    }
return new int[]{pointerA+1,pointerB+1};
}



}