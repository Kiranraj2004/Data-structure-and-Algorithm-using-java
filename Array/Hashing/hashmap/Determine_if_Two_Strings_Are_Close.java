package Array.Hashing.hashmap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Determine_if_Two_Strings_Are_Close {
    public static void main(String[] args) {
      String word1="cabbba";
      String word2="abbccc";
        System.out.println(closeStrings(word1,word2));
    }
    public  static boolean closeStrings(String word1, String word2) {
       int[]f1=new int[26];
        int[]f2=new int[26];
        for (int i = 0; i <word1.length() ; i++) {
            f1[word1.charAt(i)-'a']++;
        }
        for (int i = 0; i <word2.length() ; i++) {
            f2[word2.charAt(i)-'a']++;
        }
        for (int i = 0; i <26 ; i++) {
            if (f1[i]>0&&f2[i]==0||f2[i]>0&&f1[i]==0){
                return false;
            }
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        for (int i = 0; i <26 ; i++) {
            if (f1[i]!=f2[i]){
                return false;
            }
        }
    return true;
    }
//   this is using hashmap
//    public  static boolean closeStrings(String word1, String word2) {
//        HashMap<Character,Integer>re=new HashMap<>();
//        HashMap<Character,Integer>rs=new HashMap<>();
//        for (int i = 0; i <word1.length(); i++) {
//            if (re.containsKey(word1.charAt(i))){
//                re.put(word1.charAt(i),re.get(word1.charAt(i))+1);
//            }
//            else{
//                re.put(word1.charAt(i),1);
//            }
//        }
//        for (int i = 0; i <word2.length(); i++) {
//            if (rs.containsKey(word2.charAt(i))){
//                rs.put(word2.charAt(i),rs.get(word2.charAt(i))+1);
//            }
//            else{
//                if(!re.containsKey(word2.charAt(i))){
//                    return false;
//                }
//                rs.put(word2.charAt(i),1);
//            }
//        }
//        for (char d:rs.keySet()){
//            if (re.containsValue(rs.get(d))){
//                for(char f:re.keySet()){
//                    if (rs.get(d).equals(re.get(f))){
//                        re.remove(f);
//                        break;
//                    }
//                }
//            }
//            else{
//                return false;
//            }
//        }
//        return re.isEmpty();
//    }
}
