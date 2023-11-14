package Sorting;
//https://leetcode.com/problems/neither-minimum-nor-maximum/
import java.util.Arrays;

public class Number_either_maximum_nor_minimun {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(findNonMinOrMax(arr));
    }
    public  static int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==2||nums.length==1)return -1;
        else return nums[nums.length/2];
    }
}
