import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("nagaram", "anagram"));
        System.out.println(isAnagram2("car","rac"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int char_count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }
        for (int count : char_count) {
            if (count != 0) return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return (Arrays.equals(char1,char2));

    }
}
