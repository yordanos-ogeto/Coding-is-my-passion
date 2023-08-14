public class RotatedSortedArrayMin {
    static int []arr= new int[]{4,5,6,7,0,1,2};
  static   int[] arr1={3,4,5,1,2};
  static   int []arr2 ={11,13,15,17};

    public static void main(String[] args) {
        System.out.println(rotatedSortedArrayMint(arr));
        System.out.println(rotatedSortedArrayMint(arr1));
        System.out.println(rotatedSortedArrayMint(arr2));
    }

    public static int rotatedSortedArrayMint(int [] nums){
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid =left+(right-left)/2;
                if(nums[mid]>nums[right]){
                    left=mid+1;

                } else if (nums[mid]<nums[right]) {
                    right =mid;
                }else{
                    right--;
        }
        }
        return nums[left];
    }


}
