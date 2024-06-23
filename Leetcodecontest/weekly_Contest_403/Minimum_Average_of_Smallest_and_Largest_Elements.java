package Leetcodecontest.weekly_Contest_403;
import java.util.*;
public class Minimum_Average_of_Smallest_and_Largest_Elements {
    public static void main(String[] args) {

    }
    public double minimumAverage(int[] nums) {
        double ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            ans=Math.min(ans, (double) (nums[i] + nums[j]) /2);
            i++;
            j--;
        }
        return ans;

    }
}
