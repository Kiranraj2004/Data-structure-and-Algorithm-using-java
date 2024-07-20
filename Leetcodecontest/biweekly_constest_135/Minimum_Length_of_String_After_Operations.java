package Leetcodecontest.biweekly_constest_135;
import java.util.*;

public class Minimum_Length_of_String_After_Operations {
    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
    }
    public static  int minimumLength(String s) {
        HashMap<Character,Integer>res=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(res.containsKey(c)){
                if(res.get(c)==2){
                    res.put(c,1);
                }
                else{
                    res.put(c, res.get(c)+1);
                }
            }
            else{
                res.put(s.charAt(i),1);
            }
        }
        int count=0;
        for(int i:res.values()){
            count+=i;
        }
        return count;

    }
}
