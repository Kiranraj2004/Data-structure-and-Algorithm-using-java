package A2Z_Strivers_DSA.dynamic_programing.subset_problem;
import java.util.*;
public class subset_problem_dp1 {
    public static void main(String[] args) {

    }
//    memoization bottom up approach
    static Boolean isSubsetSum(int N, int arr[], int sum){
        int [][]dp=new int[N][sum+1];
        // code here
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(arr,sum,0,0,dp);
    }
    static boolean helper(int[]arr,int target,int i,int sum,int [][] dp){
        if(sum==target)return true;
        if(i==arr.length){
            return false;
        }
        if(dp[i][sum]!=-1) return dp[i][sum] != 0;
        if(sum+arr[i]<=target){
            if(helper(arr,target,i+1,sum+arr[i],dp)){
                dp[i][sum]=1;
                return true;
            }
        }
        if(helper(arr,target,i+1,sum,dp)){
            dp[i][sum]=1;
            return true;
        }
        dp[i][sum]=0;
        return false;
    }

//    tabulation method bottom up approach
    static Boolean isSubsetSum1(int N, int arr[], int sum){
        boolean [][]dp=new boolean[N][sum+1];
        for (int i = 0; i <N ; i++) {
            dp[i][0]=true;
        }
        if(arr[0]<=sum) dp[0][arr[0]]=true;
        for(int index=1;index<N;index++){
            for (int target = 1; target <=sum ; target++) {
                boolean nottake=dp[index-1][target];

                boolean take=false;
                if(arr[index]<=target){
                    take=dp[index-1][target-arr[index]];
                }

                dp[index][target]=nottake||take;
            }
        }
       return  dp[N-1][sum];
    }

//    space optimization
static boolean isSubsetSum2(int N, int arr[], int sum){
    boolean []prev=new boolean[sum+1];
        prev[0]=true;
    if(arr[0]<=sum)
        prev[arr[0]]=true;
    for(int index=1;index<N;index++){
        boolean []current=new boolean[sum+1];
        current[0]=true;
        for (int target = 1; target <=sum ; target++) {
            boolean nottake=prev[target];

            boolean take=false;
            if(arr[index]<=target){
                take=prev[target-arr[index]];
            }

           current[target]=nottake||take;
        }
        prev=current;
    }
    return  prev[sum];
}


    }
