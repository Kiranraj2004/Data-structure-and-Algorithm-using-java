package String;
//https://leetcode.com/problems/valid-anagram
import java.util.*;
public class Valid_Anagram {
    public static void main(String[] args) {
        String s= s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        s=sortString(s);
        t=sortString(t);
        if (s.length()!=t.length())return false;
        int i=0;
        for (int j = 0; j <s.length() ; j++) {
            if (s.charAt(i)==t.charAt(i)){
                i++;
            }
        }
        return i == s.length();
    }
    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
