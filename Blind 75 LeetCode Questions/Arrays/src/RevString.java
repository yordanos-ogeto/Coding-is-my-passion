public class RevString {
    public static void main(String[] args) {
        String st = "ABCD";
        String st1 = "Joy";
        String st2 = "HAPPY";
        System.out.println(RevString1(st));
        System.out.println(RevString2(st1));
        System.out.println(RevString3(st2));


    }

    //Using String  concatenation
    public static String RevString1(String st) {
        String reverse = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse = reverse + st.charAt(i);

        }
        return reverse;
    }

    // Using Character Array
    public static String RevString2(String st) {
        String rev = "";
        char[] chars = st.toCharArray();
        int len = chars.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + chars[i];
        }
        return rev;
    }

    //Using String buffer
    public static String RevString3(String st) {
        StringBuffer sb = new StringBuffer(st);
        sb.reverse();
        return st;
    }
}
