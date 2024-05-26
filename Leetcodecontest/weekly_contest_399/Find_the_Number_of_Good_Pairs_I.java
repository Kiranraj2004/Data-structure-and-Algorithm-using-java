package Leetcodecontest.weekly_contest_399;

public class Find_the_Number_of_Good_Pairs_I {
    public static void main(String[] args) {

    }
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if (nums1[i]%(nums2[j]*k)==0){
                    count++;
                }
            }
        }
        return count;

    }
}
