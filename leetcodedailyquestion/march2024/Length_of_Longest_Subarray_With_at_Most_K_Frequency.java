package leetcodedailyquestion.march2024;

import java.util.HashMap;

public class Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    public static void main(String[] args) {
//        daily leetcode problem 28/02/2024
        int []arr={1,2,1,2,1,2,1,2};
        System.out.println(maxSubarrayLength(arr,1));
    }
    public  static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>res=new HashMap<>();
        int start=0;
        int end=0;
        int size=0;
        while(end< nums.length){
            if(res.containsKey(nums[end])){
                res.put(nums[end],res.get(nums[end])+1);
            }else{
                res.put(nums[end],1);
            }
            while(res.get(nums[end])>k){
                res.put(nums[start],res.get(nums[start])-1);
                if (res.get(nums[start])==0){
                    res.remove(nums[start]);
                }
                start++;
            }
            end++;
            size=Math.max(size,end-start);
        }
       return size;
    }
}
