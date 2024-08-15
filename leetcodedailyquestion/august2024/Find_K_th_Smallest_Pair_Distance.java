package leetcodedailyquestion.august2024;

import java.util.*;

public class Find_K_th_Smallest_Pair_Distance {
    public static void main(String[] args) {

    }
    public int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int distance=Math.abs(nums[i]-nums[j]);
                if(map.containsKey(distance)){
                    map.put(distance,map.get(distance)+1);
                }
                else{
                    q.add(distance);
                    map.put(distance,1);
                }
            }
        }
        int i=0;
        int ans=0;
        while(i<k){
            ans=q.remove();
            int frequence=map.get(ans);
            i+=frequence;
        }
        return ans;
    }
}
