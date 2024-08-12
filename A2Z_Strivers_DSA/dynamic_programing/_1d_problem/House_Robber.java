package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int []arr={2,7,9,3,-1};
        System.out.println(rob1(arr));
    }

//    memoization top
    public static int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int max=Integer.MIN_VALUE;

           max=Math.max(max,helper(nums,dp,0));
           if(nums.length>1) max=Math.max(max,helper(nums,dp,1));
        return max;
    }
    private static int  helper(int[] nums, int[] dp, int index) {
        if(index==nums.length-1){
            return nums[index];
        }
        if(dp[index]!=-1)return dp[index];
        int max=Integer.MIN_VALUE;
        for (int i = 2; i <nums.length&&index+i<nums.length ; i++) {
                int maxrob=helper(nums,dp,index+i)+nums[index];
                max=Math.max(max,maxrob);
        }
        max=Math.max(max,nums[index]);
        return dp[index]=max;
    }

//    tabulation bottom up method
        public static int rob1(int[] nums) {
        if(nums.length==1)return nums[0];
        int []dp=new int [nums.length];
        int n=nums.length;

            dp[0] = nums[0];
            for (int i = 1; i < n; i++) {

                int pick = nums[i];

                if (i > 1)
                    pick += dp[i - 2];

                int nonPick = dp[i - 1];

                dp[i] = Math.max(pick, nonPick);
            }

            return dp[n - 1];

        }

//        space optimization
        static int solve(int n, int[] arr) {
            int prev = arr[0];
            int prev2 = 0;
            for (int i = 1; i < n; i++) {
                int pick = arr[i];
                if (i > 1)
                    pick += prev2;
                int nonPick = prev;
                int cur_i = Math.max(pick, nonPick);
                prev2 = prev;
                prev = cur_i;
            }
            return prev;
        }

}
