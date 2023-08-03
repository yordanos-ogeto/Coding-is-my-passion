import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf2(new int[]{1, 2, 3, 4})));

    }

    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length];
        int j = 1;
        //Left Pass
        for (int i = 0; i < nums.length; i++) {
            result[i] = j;
            j = j * nums[i];

        }
        //Right Pass
        j = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * j;
            j = j * nums[i];
        }
        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] left_products = new int[n];
        int[] right_products = new int[n];
        int[] results = new int[n];
        left_products[0] = 1;
        right_products[n-1] = 1;
        //[1,2,3,4]
        for (int i = 1; i < n ; i++) {
            left_products[i] = nums[i - 1] * left_products[i - 1];
        }
        System.out.println("Left result:  "+Arrays.toString(left_products));

        for (int i = n -2; i >= 0; i--) {
            right_products[i] = nums[i + 1] * right_products[i + 1];

        }
        System.out.println("Right result:  "+ Arrays.toString(right_products));

        for (int i = 0; i < n; i++) {
            results[i] = left_products[i] * right_products[i];
        }
        return results;
    }
}
