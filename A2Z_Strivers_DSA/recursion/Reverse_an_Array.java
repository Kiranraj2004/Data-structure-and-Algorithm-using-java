package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(arr.length,arr)));
    }
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        helper(0,nums.length-1,nums);
       return nums;
    }
    static void helper(int start,int end,int[]nums){
        if (start>end)return;
        int temp=nums[end];
        nums[end]=nums[start];
        nums[start]=temp;
        helper(++start,--end,nums);
    }
}
