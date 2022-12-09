package Leetcode;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowel("Yordanos"));
    }

    public static int countVowel(String st){
        int count = 0;
        String vowels = "aeiou";
        char[] chars = st.toCharArray();
        for(char c : chars){
            if(vowels.indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
}
