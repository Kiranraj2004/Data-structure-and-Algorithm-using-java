package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

import java.util.Arrays;

public class Target_Sum {
    public static void main(String[] args) {
        Target_Sum obj=new Target_Sum();
        int []arr={0,0,0,0,0,0,0,0,1};
        System.out.println(obj.findTargetSumWays(arr,1));
    }

//     memoization top up approach
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if((sum-target)<0||(sum-target)%2==1)return 0;
        int s2=(sum-target)/2;
        int [][]dp=new int[nums.length][s2+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return helper(nums,s2,nums.length-1,0,dp);
    }

    private int helper(int[] nums, int target, int index, int sum,int [][]dp) {
        if(index<0){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        if(dp[index][sum]!=-1)return dp[index][sum];
        int  nottake=helper(nums,target, index-1,sum,dp);
        int take=0;
        if(sum+nums[index]<=target){
            take=helper(nums,target,index-1,sum+nums[index],dp);
        }
        return dp[index][sum]=nottake+take;
    }

//     tabulation bottom up method
    public int findTargetSumWays1(int[] num, int tar) {
        int n = num.length;

        // Create a 2D array to store results of subproblems
        int[][] dp = new int[n][tar + 1];

        // Initialize the dp array for the first element of the array
        if (num[0] == 0)
            dp[0][0] = 2; // 2 cases - pick and not pick
        else
            dp[0][0] = 1; // 1 case - not pick

        if (num[0] != 0 && num[0] <= tar)
            dp[0][num[0]] = 1; // 1 case - pick

        // Fill the dp array using dynamic programming
        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= tar; target++) {
                int notTaken = dp[ind - 1][target];

                int taken = 0;
                if (num[ind] <= target)
                    taken = dp[ind - 1][target - num[ind]];

                dp[ind][target] = (notTaken + taken);
            }
        }
        return dp[n - 1][tar];

    }
}
