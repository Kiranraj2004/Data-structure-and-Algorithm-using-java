package A_LeetCode_75;
//this is the prefix and suffix based problem

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
       int[]res=new int[nums.length];
       int product=1;
        for (int i = 0; i <nums.length ; i++) {
            res[i]=product;
            product*=nums[i];
        }
        product=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            res[i] *= product;
            product*=nums[i];
        }
        return res;
    }
}
