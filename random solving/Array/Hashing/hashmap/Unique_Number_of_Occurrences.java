package Array.Hashing.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int []arr={1,2};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>res=new HashMap<>();
        for (int j : arr) {
            if (res.containsKey(j)) {
                res.put(j, res.get(j) + 1);
            } else {
                res.put(j, 1);
            }
        }
        HashSet<Integer> s = new HashSet<>(res.values());
        return res.size()==s.size();
    }
}
