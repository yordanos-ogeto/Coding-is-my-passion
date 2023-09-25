import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String []st = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAngram(st));

    }

    public static List<List<String>> groupAngram(String[] strArr){
        char[] chars =null;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strArr.length; i++) {
            chars=strArr[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(strArr[i]);
               // System.out.println(map.values()+"........");

            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strArr[i]);
                map.put(sortedString,list);
            }

        }

        return new ArrayList<>(map.values()) ;

    }
}
