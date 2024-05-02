package leetcodedailyquestion.May2024;

import java.util.Arrays;
import java.util.HashSet;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public static void main(String[] args) {
        int[]arr={-1,10,6,7,1};
        System.out.println(findMaxK(arr));
    }
    public static int findMaxK(int[] nums) {
//        HashSet<Integer>s=new HashSet<>();
//        for(int i:nums){
//            if (i<0)
//              s.add(i);
//        }
//        Arrays.sort(nums);
//        int i=nums.length-1;
//        while(i>=0&&nums[i]>0){
//            if (s.contains(nums[i]*-1)){
//                return nums[i];
//            }
//            i--;
//        }
//        return -1;

        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end&&nums[start]<0){
            if (nums[end]==(-1*nums[start])){
                return nums[end];
            }
            else if(nums[end]>(-1*nums[start])){
                end--;
            }
            else{
                start++;
            }
        }
        return -1;
    }
}
