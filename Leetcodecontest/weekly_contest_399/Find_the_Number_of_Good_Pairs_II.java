package Leetcodecontest.weekly_contest_399;

import java.util.Arrays;

public class Find_the_Number_of_Good_Pairs_II {
    public static void main(String[] args) {

    }
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long count=0;
        Arrays.sort(nums2);
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if ((nums2[j]*k)>nums1[i]){
                    break;
                }
                else{
                    if (nums1[i]%(nums2[j]*k)==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
