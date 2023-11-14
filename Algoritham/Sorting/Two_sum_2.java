package Sorting;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
import java.util.Arrays;

public class Two_sum_2 {
    public static void main(String[] args) {
        int[]numbers={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
    public  static int[] twoSum(int[] number, int target) {
        int start=0,end=number.length-1;
        while(start<end){
            if (number[start]+number[end]==target){
                return new int[]{start+1,end+1};
            }
            if (number[start] + number[end]>target){
                end--;
            }
            else start++;
        }
          return new int[]{};
    }
}
