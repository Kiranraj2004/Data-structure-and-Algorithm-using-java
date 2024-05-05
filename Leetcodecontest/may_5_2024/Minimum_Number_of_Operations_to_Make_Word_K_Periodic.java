package Leetcodecontest.may_5_2024;

import java.util.HashMap;

public class Minimum_Number_of_Operations_to_Make_Word_K_Periodic {
    public static void main(String[] args) {
        String word = "leetcoleet";
        System.out.println(minimumOperationsToMakeKPeriodic(word,2));

    }
    public  static int minimumOperationsToMakeKPeriodic(String word, int k) {
        HashMap<String,Integer>res=new HashMap<>();
        for (int i = 0; i <word.length() ; i+=k) {
            String temp=word.substring(i,i+k);
            if (res.containsKey(temp)){
                res.put(temp,res.get(temp)+1);
            }
            else{
                res.put(temp,1);
            }
        }
        int max=0;
        for(String s:res.keySet()){
            if (max<res.get(s)){
                max=res.get(s);
            }
        }
        int maximum=max*k;

        return (word.length()-maximum)/k;
    }
}
