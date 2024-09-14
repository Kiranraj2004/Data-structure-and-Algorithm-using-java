package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

import java.util.Arrays;

public class Coin_Change {
    public static void main(String[] args) {
        int []arr={1,2,5};
        Coin_Change obj=new Coin_Change();
        System.out.println(obj.coinChange(arr,11));
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0)return 0;
        int [][]dp=new int[coins.length][amount+1];
       for(int[]a:dp){
           Arrays.fill(a,-1);
       }
        int ans= helper1(coins,amount,0,dp);
        if(ans>=(int) Math.pow(10, 9)){
            return -1;
        }
        return  ans;
    }

//     this will give the minimum  number required to reach target
    private int helper(int[] arr, int target,int i,   int [][]dp) {
        if(i==arr.length){
            if(target==0){
                return 0;
            }
            return   (int) Math.pow(10, 9);
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int take=(int) Math.pow(10, 9);
        if(arr[i]<=target){
            take=1+helper(arr,target-arr[i],i,dp);
        }
        int nottake= helper(arr, target, i + 1, dp);
        return dp[i][target]=Math.min(take,nottake);
    }
    private int helper1(int[] arr, int target,int i,   int [][]dp) {
        if(i==arr.length){
            if(target==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int take=0;
        if(arr[i]<=target){
            take+=helper1(arr,target-arr[i],i,dp);
        }
        int nottake = helper1(arr, target, i + 1, dp);
        return dp[i][target]=take+nottake;
    }
}
