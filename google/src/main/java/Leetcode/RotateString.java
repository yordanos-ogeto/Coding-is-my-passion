package Leetcode;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("ABCD","CDAB"));

    }

    public static boolean rotateString(String a,String b){
        boolean result = a.length()==b.length() && (a+a).contains(b);
        return result;
                
    }
}
