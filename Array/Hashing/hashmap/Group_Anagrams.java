package Array.Hashing.hashmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[]str={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));

    }
    public static List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>>re=new HashMap<>();
        for (String word:str) {
            char[]sor=word.toCharArray();
            Arrays.sort(sor);
            String sortstr=new String(sor);
            if(re.containsKey(sortstr)){
                re.get(sortstr).add(word);
            }
            else{
                re.put(sortstr,new ArrayList<>());
                re.get(sortstr).add(word);
            }
        }
        return new ArrayList<>(re.values());
    }
}
