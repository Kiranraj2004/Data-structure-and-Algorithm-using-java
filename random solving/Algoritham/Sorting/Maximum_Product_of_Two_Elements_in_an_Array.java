package Sorting;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
import java.util.Arrays;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        int []nums={1,5,4,5};
        System.out.println(maxProduct(nums));

    }
    public  static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

    }
}
