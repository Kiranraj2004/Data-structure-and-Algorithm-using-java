package Array.Twopointer;

import java.util.Arrays;

public class Sum3_Closest {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8};
        System.out.println(threeSumClosest(nums,8));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
     int closest=Integer.MAX_VALUE;

     int i=0;
     while (i<nums.length-2){
         int j=i+1;
         int k=nums.length-1;
         while (j<k){
             int sum=nums[i]+nums[j]+nums[k];
             int d1=Math.abs(sum-target);
             int d2=Math.abs(closest-target);
             if (d1<d2){
                 closest=sum;
             }
             else if(target>sum){
                 j++;
             }else{
                 k--;
             }
         }
         i++;
     }
       return closest;
    }
}
