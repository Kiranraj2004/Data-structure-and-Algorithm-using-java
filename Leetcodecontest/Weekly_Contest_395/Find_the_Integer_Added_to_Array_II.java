package Leetcodecontest.Weekly_Contest_395;

import java.util.Arrays;

public class Find_the_Integer_Added_to_Array_II {
    public static void main(String[] args) {
       int [] nums1 = {4,20,16,12,8};
       int[]nums2 = {14,18,10};
        System.out.println(minimumAddedInteger(nums1,nums2));

    }
    public static  int minimumAddedInteger(int[] nums1, int[] nums2) {
        int sum2=0;
        for(int i:nums2){
            sum2+=i;
        }
        Arrays.sort(nums1);
        int sum1=0;
        for (int i = 2; i <nums1.length ; i++) {
            sum1+=nums1[i];
        }
        return (sum2-sum1)/nums2.length;
    }
}
