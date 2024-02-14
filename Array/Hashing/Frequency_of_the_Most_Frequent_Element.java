package Array.Hashing;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element {
    public static void main(String[] args) {
        int []nums={3,6,9};
        System.out.println(maxFrequency(nums,2));
    }
    public  static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
      int start=0;
      int end =1;
      int max=1;
      while (start<end&&end<nums.length){
          int diff=nums[end]-nums[end-1];
          while (diff>=k&&start<nums.length-1){
              int d=nums[start]-nums[start+1];
              k+=d;
              start++;
          }
          if ( k!=0){
              k-=diff;
              max=Math.max(max,(end-start)+1);
          }
          end++;
      }
      return max;
    }
}
