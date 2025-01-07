package sliding_window;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int start,end,max;
        start=end=max=0;
        HashMap<Character,Integer>a=new HashMap<>();
        while (end< s.length()){
            if (a.containsKey(s.charAt(end))){
                max=Math.max(max,(end-start));
                if (a.get(s.charAt(end))>=start)
                  start=a.get(s.charAt(end))+1;
                a.put(s.charAt(end),end);
            }
            else {
                a.put(s.charAt(end),end);
            }
            end++;
        }
        max=Math.max(max,(end-start));
        return max;
    }
}
