package Bit_manupulation;
//https://leetcode.com/problems/single-number
public class Single_number {
    public static void main(String[] args) {
        int[]nums={2,1,2,3,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int answer=0;
        for (int i = 0; i <nums.length ; i++) {
         answer=answer^nums[i];
        }
        return answer;

    }
}
