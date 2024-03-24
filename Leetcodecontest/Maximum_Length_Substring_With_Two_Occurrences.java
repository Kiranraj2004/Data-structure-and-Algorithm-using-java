package Leetcodecontest;

import java.util.HashMap;

public class Maximum_Length_Substring_With_Two_Occurrences {
    public static void main(String[] args) {
        String s="bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
    public static int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>res=new HashMap<>();
        int start=0;
        int end=0;
        int length=0;
        while(end<s.length()){
            if (res.containsKey(s.charAt(end))){
                while (res.get(s.charAt(end))==2){
                    res.put(s.charAt(start),res.get(s.charAt(start))-1);
                    if(res.get(s.charAt(start))==0){
                        res.remove(s.charAt(start));
                    }
                    start++;
                }
                res.put(s.charAt(end), res.get(s.charAt(end))+1);
            }
            else{
                res.put(s.charAt(end),1);
            }
            end++;
            length=Math.max(end-start,length);
        }
        return length;
    }
}
