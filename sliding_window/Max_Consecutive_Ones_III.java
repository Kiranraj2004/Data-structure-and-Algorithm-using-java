package sliding_window;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int[]nums={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums,2));
    }
    public static int longestOnes(int[] nums, int k) {
       int start=0;
       int end=0;
        while(end<nums.length){
            if (nums[end]==0){
                k--;
            }
            if (k<0){
                if (nums[start]==0){
                    k++;
                }
                start++;
            }
            end++;
        }
        return end-start;
    }
//this another answer
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0, right = 0;
            int count = 0;
            int max = 0;
            while(right < nums.length) {
                if(nums[right] == 0) {
                    count++;
                }
                while(left <= right && count > k) {
                    if(nums[left] == 0)
                        count--;
                    left++;
                }
                max = Math.max(max, right - left + 1);
                right++;
            }
            return max ;
        }
    }
}
