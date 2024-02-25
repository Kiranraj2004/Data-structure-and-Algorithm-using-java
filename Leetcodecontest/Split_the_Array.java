package Leetcodecontest;
import java.util.*;
public class Split_the_Array {
    public static void main(String[] args) {
//        first problem on 25/2/2024 second contest
        int[]nums={2,10,2,7,8,9,7,6,6,9};
        System.out.println(isPossibleToSplit(nums));
    }
    public static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>temp=new HashMap();
        for (int i = 0; i < nums.length ; i++) {
            if (temp.containsKey(nums[i])){
                temp.put(nums[i],temp.get(nums[i])+1);
                if (temp.get(nums[i])>2){
                    return false;
                }
            }
            else{
                temp.put(nums[i],1);
            }
        }
         return true;
    }
}
