package Leetcodecontest.weekly_contest_402;

import java.util.HashMap;

public class Count_Pairs_That_Form_a_Complete_Day_II {
    public static void main(String[] args) {
        int[]arr={72,48,24,3,21,24};
        System.out.println(countCompleteDayPairs(arr));
    }
    public static long countCompleteDayPairs(int[] hours) {
        long count=0;
        HashMap<Integer,Integer>temp=new HashMap<>();
        for (int i = 0; i <hours.length ; i++) {
            int sum=hours[i]%24;
            if(sum==0&& temp.containsKey(0)){
                count+=temp.get(sum);
            }
            else if(temp.containsKey(24-sum)) {
                int a=24-sum;
                count+=temp.get(a);
            }
            if (temp.containsKey(sum)){
                temp.put(sum,temp.get(sum)+1);
            }
            else{
                temp.put(sum,1);
            }
        }
        return count;
    }

}
