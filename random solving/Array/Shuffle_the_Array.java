package array;
//https://leetcode.com/problems/shuffle-the-array
import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums,4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[]arr=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (i%2==1){
                arr[i]=nums[n];
                n++;
            }
            else arr[i] = nums[i / 2];


        }
          return arr;
    }
}
