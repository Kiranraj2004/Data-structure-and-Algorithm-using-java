package Sorting;
//https://leetcode.com/problems/array-partition
import java.util.Arrays;

public class Array_Partition {
    public static void main(String[] args) {
        int[]nums={ 6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));

    }
    public  static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i <nums.length ; i+=2) {
            sum+=nums[i];
        }
return sum;
    }
}
