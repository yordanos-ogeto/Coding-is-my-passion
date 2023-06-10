import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        System.out.println(containDuplicate(new int[]{1,2,3,1}));
        System.out.println(containDup(new int[]{1,2,3}));
    }
    public static boolean containDuplicate(int[] nums){
        HashSet<Integer> numbers =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }
    public static boolean containDup(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]) return true;

        }
        return false;
    }
}
