package Sorting;
//https://leetcode.com/problems/sort-colors
import java.util.Arrays;

public class Sort_colour {
    public static void main(String[] args) {
        int []nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
    public  static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length-i ; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }

            }

        }

    }
}
