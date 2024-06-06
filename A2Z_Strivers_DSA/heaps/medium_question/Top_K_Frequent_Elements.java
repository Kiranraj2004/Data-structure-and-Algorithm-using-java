package A2Z_Strivers_DSA.heaps.medium_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int []a={1,1,1,2,2,3,4};
        System.out.println(Arrays.toString(topKFrequent(a,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>s=new HashMap<>();
       for(int i:nums){
           if (s.containsKey(i)){
               s.put(i,s.get(i)+1);
           }
           else{
               s.put(i,1);
           }
       }
       int count=0;
       ArrayList<Integer>frequenece=new ArrayList<>(s.values());
        Collections.sort(frequenece);
        ArrayList<Integer>f=new ArrayList<>();
        for (int i = frequenece.size()-1; i >= frequenece.size()-k ; i--) {
            f.add(frequenece.get(i));
        }
       int[] res=new int[k];
       int a=0;
        for(int i:s.keySet()){
            if (f.contains(s.get(i))){
                res[a]=i;
                a++;
                f.remove(s.get(i));
            }
        }
        return res;

    }
}
