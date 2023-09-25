package MiuSampleExam;

public class CenteredArray {
    public static void main(String[] args) {
        int []  n1 = {1, 2, 3, 4, 5};
        int []  n2 = {3, 2, 1, 4, 5};
        int []  n3 = {3, 2, 1, 4, 1};
        int []  n4 = {1, 2, 3, 4};
        int []  n5 = {};
        int []  n6 = {10};
        System.out.println(centeredArr(n1));
        System.out.println(centeredArr(n2));
        System.out.println(centeredArr(n3));
        System.out.println(centeredArr(n4));
        System.out.println(centeredArr(n5));
        System.out.println(centeredArr(n6));


    }

    public static int centeredArr(int[] n){
        if(n.length%2==0) return 0;
        // int []  n2 = {3, 2, 1, 4, 5};


        // ** n1 = {1, 2, 3, 4, 5};
        int middle = n.length/2; //2
        for (int i = 0; i < n.length; i++) {
            if(n[middle]>= n[i] && middle!=i){
                //n[2] < n[0] && 2!=0
                //3<1 =F &&  T
                return 0;
            }

        }
        return 1;
    }
}
