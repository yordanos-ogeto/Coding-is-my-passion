package Leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(123%10);
        System.out.println(123/10);
        System.out.println(reverse(120));
    }
    public static  int reverse(int x){
        int result=0;
        while (x!=0){
            int remainder = x%10;
            result = result*10+remainder;
            x=x/10;
        }
        return result;
    }
}
