package Sorting;
//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/
import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int[]nums={4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));

    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int product1=nums[nums.length-1]*nums[nums.length-2];
        int product2=nums[0]*nums[1];
        return product1-product2;

    }
}
