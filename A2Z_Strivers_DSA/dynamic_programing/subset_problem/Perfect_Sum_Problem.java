package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

import java.util.Arrays;

public class Perfect_Sum_Problem {
    public static void main(String[] args) {
        Perfect_Sum_Problem obj=new Perfect_Sum_Problem();
        int []arr={2, 5, 1, 4, 3};
        System.out.println(obj.perfectSum1(arr,arr.length,10));
    }

//    memoization mt method but iam using bottom up approach
    public int perfectSum(int arr[],int n, int sum)
    {
        int [][]dp=new int[n][sum+1];
        // code here
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(arr,sum,0,0,dp);
    }
    static int helper(int[]arr,int target,int i,int sum,int [][] dp){

        if(i==arr.length){
            if(sum==target)return 1;
            return 0;
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int takesum=0;
        int nottakesum=0;
        if(sum+arr[i]<=target){
            takesum=helper(arr,target,i+1,sum+arr[i],dp);
        }
        nottakesum=helper(arr,target,i+1,sum,dp);
        return  dp[i][sum]=(takesum+nottakesum)%((int)Math.pow(10,9)+7);
    }

//    tabulation bottom up method
    public int perfectSum1(int arr[],int n, int sum)
    {
        // Your code goes here
        int [][]dp=new int [n][sum+1];
        for (int i = 0; i <n ; i++) {
            dp[i][0]=1;
        }
        if(arr[0]<=sum){
            dp[0][arr[0]]=1;
        }
        for (int index = 1; index <n ; index++) {
            for (int target = 1; target <=sum ; target++) {
                int nottake=dp[index-1][target];
                int take=0;
                if(arr[index]<=target){
                    take=dp[index-1][target-arr[index]];
                }
                dp[index][target]=take+nottake%((int)Math.pow(10,9)+7);
            }
        }
        return dp[n-1][sum];
    }


}
