import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));

    }

    public static int[] productExceptSelf(int[] nums){
        if(nums==null || nums.length==0) return new int[0];
        int[] result = new int[nums.length];
        int j=1;
        //Left Pass
        for (int i = 0; i < nums.length ; i++) {
            result[i]=j;
            j=j*nums[i];

        }
        //Right Pass
        j=1;
        for (int i = nums.length-1; i>=0; i--) {
            result[i]=result[i]*j;
            j=j*nums[i];
        }
      return result;
    }
}
