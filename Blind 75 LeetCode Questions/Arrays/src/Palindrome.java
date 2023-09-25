public class Palindrome {
    public static void main(String[] args) {
        int num = 1234;
        int num2=121;
        System.out.println(isPalendrom(num));
        System.out.println(isPalendrom(num2));
    }
    public static  boolean isPalendrom(int num){
        int rev= 0;
        int org_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev){
            return true;
        }else{
            return false;
        }
    }
}
