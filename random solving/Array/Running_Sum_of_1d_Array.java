package Array;

import java.util.Arrays;
//i solved this easy level array question in 6 min:01 sec
public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public  static int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
