public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcbad"));
    }

    public static boolean isPalindrome(String st) {
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
