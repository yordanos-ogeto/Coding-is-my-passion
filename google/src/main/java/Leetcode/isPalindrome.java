package Leetcode;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(x / 10);
        System.out.println(x % 10);
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverses = 0;
        int orginal = x;
        int y = 0;
        while(x>0){
            y=x%10;
            reverses = reverses*10+y;
            x/=10;
        }
        if(orginal==reverses) return true;
        return false;
    }
}




