import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        String[] st = {"Java", "C++", "Java", "Python"};
        String[] st2 = {"Java", "C++", "JS", "Python", "JS"};
        int[] arr = {2,3,2,3,4,5,6,5};
        System.out.println(DuplicateEle(st));
        System.out.println(DuplicateEle2(st2));

        System.out.println(printDuplicate(arr));

    }

    //Bruth Force theory
    public static boolean DuplicateEle(String st[]) {
        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if (st[i] == st[j]) {
                    return true;
                }

            }

        }
        return false;

    }

    public static boolean DuplicateEle2(String[] st) {
        HashSet<String> set = new HashSet<>();
        for (String s : st) {
            if (set.contains(s)) {
                return true;
            } else {
                set.add(s);
            }

        }
        return false;
    }

    public static ArrayList<Integer> printDuplicate(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    arrayList.add(arr[i]);
                }

            }

        }
        return arrayList;
    }

}
