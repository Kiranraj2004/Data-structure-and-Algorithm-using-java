package A2Z_Strivers_DSA.string.medium;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {

    }

    static class pair{
        char s;
        int count;
        pair(char i,int j){
            s=i;
            count=j;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<pair>arr=new ArrayList<>();
        for(char i:map.keySet()){
            arr.add(new pair(i,map.get(i)));
        }
        Collections.sort(arr,(x,y)->y.count-x.count);
        StringBuffer ans=new StringBuffer();
        for(pair i:arr){
            char a=i.s;
            int count=i.count;
            ans.append(String.valueOf(a).repeat(Math.max(0, count)));
        }
        return ans.toString();

    }

}
