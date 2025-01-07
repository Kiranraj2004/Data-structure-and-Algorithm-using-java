package Sorting;
//https://leetcode.com/problems/first-missing-positive/
public class First_Missing_Positive {
    public static void main(String[] args) {
        int[]nums={1,2,3,5};
        System.out.println(firstMissingPositive(nums));
    }
    public  static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;

            if ( nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
    }
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j]!=j+1){
                return j+1;
            }
        }

        return nums.length+1;

        }
}
