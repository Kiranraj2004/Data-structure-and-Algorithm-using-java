package array;
//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class Concatenation_of_array {
    public static void main(String[] args) {
        int []nums={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int []answer=new int[2* nums.length];
        for (int i = 0; i <nums.length ; i++) {
//           answer[i]=nums[i];
//           answer[nums.length+i]=nums[i];
//            or
answer[i]=answer[i+ nums.length]=nums[i];
        }
        return answer;

    }
}
