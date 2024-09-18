package leetcodedailyquestion.september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
        Uncommon_Words_from_Two_Sentences obj=new Uncommon_Words_from_Two_Sentences();
        System.out.println(Arrays.toString(obj.uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] ts1=s1.split(" ");
        String[] ts2=s1.split(" ");
        HashMap<String,Integer>maps1=new HashMap<>();
        HashMap<String,Integer>maps2=new HashMap<>();
        for (String s : ts1) {
            maps1.put(s, maps1.getOrDefault(s, 0) + 1);
        }
        for (String s : ts2) {
            if (maps2.containsKey(s)) {
                maps2.put(s, maps2.get(s) + 1);
            } else {
                maps2.put(s, 1);
            }
        }
        ArrayList<String>res=new ArrayList<>();
        for(String i:maps1.keySet()){
            if(maps1.get(i)==1){
                if(!maps2.containsKey(i)){
                    res.add(i);
                }
            }
        }
        for(String i:maps2.keySet()){
            if(maps2.get(i)==1){
                if(!maps1.containsKey(i)){
                    res.add(i);
                }
            }
        }
         String[] ans=new String[res.size()];
        int j=0;
        for(String i:res){
            ans[j]=i;
            j++;
        }
        return  ans;
    }
}
