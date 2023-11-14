package array;

import java.util.Arrays;
//https://leetcode.com/problems/build-array-from-permutation/
public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[]nums={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public  static int[] buildArray(int[] nums) {
        int []answer=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            answer[i]=nums[nums[i]];

        }
        return answer;

    }

}
//Input: nums = [5,0,1,2,3,4]
//Output: [4,5,0,1,2,3]
//Explanation: The array ans is built as follows:
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//    = [4,5,0,1,2,3]
