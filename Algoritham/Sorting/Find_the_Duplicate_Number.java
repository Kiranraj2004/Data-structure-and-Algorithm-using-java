package Sorting;
//https://leetcode.com/problems/find-the-duplicate-number/

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[]nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));

    }
    public  static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]&&nums[i]!=i+1){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }

        }
return nums[nums.length-1];
    }
}
