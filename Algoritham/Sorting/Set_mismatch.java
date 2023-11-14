package Sorting;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class Set_mismatch {
    public static void main(String[] args) {
        int[]nums={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public  static int[] findErrorNums(int[] nums) {
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
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }

        }
        return new int[]{-1,-1};

    }
}
