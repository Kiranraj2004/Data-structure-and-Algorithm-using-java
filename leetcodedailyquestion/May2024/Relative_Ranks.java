package leetcodedailyquestion.May2024;

import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }

//    O(3nlogn)time complexity and O(n)space complexity
    public  static String[] findRelativeRanks(int[] score) {
        String[] res=new String[score.length];
        HashMap<Integer,Integer>s=new HashMap<>();
        for (int i = 0; i <score.length ; i++) {
            s.put(score[i],i);
        }
        Arrays.sort(score);
        for (int i = score.length-1; i >=0 ; i--) {
            int index=s.get(score[i]);
            int j= score.length-i;
            if (j==1){
                res[index]= "Gold Medal";
            }
            else if(j==2){
                res[index]= "Silver Medal";
            }
            else if(j==3){
                res[index]="Bronze Medal";
            }
            else{
                res[index]=String.valueOf(j);
            }
        }
        return res;

    }
}
