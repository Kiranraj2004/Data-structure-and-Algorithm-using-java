package Array.Hashing.hashmap;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
     String s="foa";
     String t="baa";
        System.out.println(isIsomorphic(s,t));
    }
    public  static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>temp=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if (temp.containsKey(s.charAt(i))){
                if(temp.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else if (temp.containsValue(t.charAt(i))) {
                return false;
            } else {
                temp.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
