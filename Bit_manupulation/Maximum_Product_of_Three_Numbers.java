package Bit_manupulation;
//https://leetcode.com/problems/maximum-product-of-three-numbers
import java.util.Arrays;
public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        int []nums={1,2,3,5,6};
        int []m={23,45,67,23,12};
        sort(m);
        System.out.println(Arrays.toString(m));
//        System.out.println(maximumProduct(nums));
    }
    public  static int maximumProduct(int[] nums) {
       sort(nums);
        int num1=nums[0]*nums[1]*nums[nums.length-1];
        int num2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

          return Math.max(num1,num2);
    }
    static void sort(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j <nums.length-i ; j++) {
                if (nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }

}
