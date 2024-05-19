package Leetcodecontest.weekly_contest_398;
//https://leetcode.com/contest/weekly-contest-398/problems/special-array-i/
public class Special_Array_I {
    public static void main(String[] args) {
        int []nums={2,1,4};
        System.out.println(isArraySpecial(nums));
    }
    public static boolean isArraySpecial(int[] nums) {
        int prev=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int current=nums[i]%2;
            if(prev==current){
                return false;
            }
            prev=current;
        }
        return true;

    }
}
