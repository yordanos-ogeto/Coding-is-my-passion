import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum3(new int[]{2,7,11,15},9)));
        System.out.println("********************************");
        System.out.println(Arrays.toString(twoSum2(new int[]{2,3,5,7,10,12,15,20},19)));
        System.out.println(Arrays.toString(twoSum3(new int[]{2,3,5,7,10,12,15,20},19)));

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
            return new int[]{pointerA,pointerB};
        }
    }
return new int[]{pointerA,pointerB};
}

public static int[] twoSum2(int[]num,int target){
        int i=0;
        int j=num.length-1;
        while (num[i]+num[j]!=target){
            if(num[i]+num[j]<target){
                i++;

            }else{
                j--;
            }
        }
        return new int[]{i,j};
}
public static int[] twoSum3(int[]num,int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<num.length;i++){
        int value = target-num[i];
        if (map.containsKey(value)) {
            return new int[]{map.get(value),i};

        }else {
            map.put(num[i],i);

        }
    }
    return new int[]{};
}

}