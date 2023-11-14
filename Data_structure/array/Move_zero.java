package array;
//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class Move_zero {
    public static void main(String[] args) {
        int[]nums={1};
        move_zero(nums);
    }
    public static void move_zero(int[]nums){
        int n=0;
        if (nums.length-1!=0){
        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i]!=0){
                nums[n] = nums[i];
                if (i!=n) {
                    nums[i]=0;
                }
                n++;
            }

        }
        }
        System.out.println(Arrays.toString(nums));
    }
}
