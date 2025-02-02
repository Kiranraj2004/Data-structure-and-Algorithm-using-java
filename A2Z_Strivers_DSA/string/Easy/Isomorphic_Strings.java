package A2Z_Strivers_DSA.string.Easy;
import java.util.*;
public class Isomorphic_Strings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>res=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if ((res.containsKey(s.charAt(i)))){
                if(t.charAt(i)!=res.get(s.charAt(i))){
                    return false;
                }
            }
            else{
                if(res.containsValue(t.charAt(i)))return false;
                res.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
