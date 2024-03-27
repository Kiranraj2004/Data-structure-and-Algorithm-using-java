package sliding_window;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s="AABABBA";
        System.out.println(characterReplacement(s,1));
    }
//    public  static int characterReplacement(String s, int k) {
//        int start,max;
//        start=max=0;
//        int maxcount=0;
//        int[] charcounts=new int[26];
//        for (int end = 0; end <s.length() ; end++) {
//            charcounts[s.charAt(end)-'A']++;
//            maxcount=Math.max(maxcount, charcounts[s.charAt(end)-'A']);
//            if(end-start+1-maxcount>k){
//                charcounts[s.charAt(start)-'A']--;
//                start++;
//            }
//            max=Math.max(max,end-start+1);
//        }
//
//        return max;
//    }
public  static int characterReplacement(String s, int k) {
  int start,maxcount,max;
  start=maxcount=max=0;
    HashMap<Character,Integer>charcount=new HashMap<>();
    for (int end = 0; end < s.length(); end++) {
        if (charcount.containsKey(s.charAt(end))){
            charcount.put(s.charAt(end),charcount.get(s.charAt(end))+1);
        }
        else{
            charcount.put(s.charAt(end),1);
        }
        maxcount=Math.max(maxcount,charcount.get(s.charAt(end)));
        if (end-start-maxcount+1>k){
            charcount.put(s.charAt(start),(charcount.get(s.charAt(start)))-1);
            start++;
        }
        max=Math.max(max,end-start+1);
    }
    return max;
}
}
