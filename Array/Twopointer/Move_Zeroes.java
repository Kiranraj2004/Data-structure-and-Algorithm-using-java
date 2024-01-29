package Array.Twopointer;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int []nums={1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
    int n=0;
        for (int i = 0; i <nums.length ; i++) {
                while (n!=nums.length&&nums[n]!=0){
                    n++;
                }
                if (nums[i]!=0&&n!=nums.length){
                    int temp=nums[i];
                    nums[i]=nums[n];
                    nums[n]=temp;
                }
        }

    }
}
