package leetcodedailyquestion.march2024;

import java.util.HashMap;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {
    public static void main(String[] args) {
        int[]arr={1,3,2,3};
        System.out.println(countSubarrays(arr,2));
    }
    public static long countSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>res=new HashMap<>();
        int start=0;
        int end=0;
        long count=0;
        boolean a=false;
        while(end<nums.length){
            if(res.containsKey(nums[end])){
                res.put(nums[end],res.get(nums[end])+1);
            }else{
                res.put(nums[end],1);
            }
          while(res.get(nums[end])>=k){
              res.put(nums[start],res.get(nums[start])-1);
              if (res.get(nums[start])==0){
                  res.remove(nums[start]);
              }
              start++;
              a=true;
          }if (a) {
              a=false;
                count += start;
            }
           end++;
        }
        return count;

    }
}
