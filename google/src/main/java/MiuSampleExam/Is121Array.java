package MiuSampleExam;

public class Is121Array {
    public static void main(String[] args) {

        int[] arr1 ={1, 2, 1};
        int[] arr2 ={1, 1, 2, 2, 2, 1, 1};
        int[] arr3={1, 1, 2, 2, 2, 1, 1, 1};
        int[] arr4 ={1, 1, 2, 1, 2, 1, 1};
        int[] arr5 ={1, 1, 1, 2, 2, 2, 1, 1, 1,3};
        int[] arr6 ={1, 1, 1, 1, 1, 1};
        int[] arr7 ={2, 2, 2, 1, 1, 1, 2, 2, 2,1, 1};
        int[] arr8 ={1, 1, 1, 2, 2, 2, 1, 1, 2, 2};
        int[] arr9 ={2, 2, 2};
            System.out.println(isOne2OneArray(arr1));
            System.out.println(isOne2OneArray(arr2));
            System.out.println(isOne2OneArray(arr3));
            System.out.println(isOne2OneArray(arr4));
            System.out.println(isOne2OneArray(arr5));
            System.out.println(isOne2OneArray(arr6));
            System.out.println(isOne2OneArray(arr7));
           System.out.println(isOne2OneArray(arr8));
            System.out.println(isOne2OneArray(arr9));

           }

    public static int isOne2OneArray(int[] arr){
        int mid = arr.length/2;
        int start = mid-1;
        int end =mid+1;
            if(arr[mid]!=2)return 0;
       if(arr.length%2==0) return 0;
       if(arr[0]!=1||arr[arr.length-1]!=1)return 0;

                    while (arr[start]<0 && arr[end]>=mid){
                if(arr[start]!=1 || arr[start]!=2 && arr[end]!=1||arr[end]!=2){
                    return 0;
                }
                else if(arr[start]!=arr[end])
                    return 0;

                start--;
                end++;
            }
            return 1;

        }
    }

