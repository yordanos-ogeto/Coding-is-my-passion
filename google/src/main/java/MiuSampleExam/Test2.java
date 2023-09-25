package MiuSampleExam;

public class Test2 {
    public static void main(String[] args) {
        int []  n1 = {1};
        int []  n2 = {1, 2};
        int []  n3 = {1, 2, 3};
        int []  n4 = {1, 2, 3, 4};
        int []  n5 = {3, 3, 4, 4};
        int []  n6 = {3, 2, 3, 4};
        System.out.println(f1(n1));
        System.out.println(f1(n2));
        System.out.println(f1(n3));
        System.out.println(f1(n4));
        System.out.println(f1(n5));
        System.out.println(f1(n6));
    }

    public static int f1(int [] arr){
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                evenNum = evenNum+arr[i];
            }
           else oddNum = oddNum+arr[i];
        }
        return oddNum-evenNum;
    }
}
