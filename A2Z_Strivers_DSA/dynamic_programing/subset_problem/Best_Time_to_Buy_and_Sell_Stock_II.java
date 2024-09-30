package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

import A2Z_Strivers_DSA.dynamic_programing.Best_Time_to_Buy_and_Sell_Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_II obj=new Best_Time_to_Buy_and_Sell_Stock_II();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
        ArrayList<Integer>a=new ArrayList<>();



    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][]dp=new int[n][2];
        for(int[]row:dp) Arrays.fill(row,-1);
        return helper(prices,0,1,dp);

    }

    private int helper(int[] prices, int i, int b,int[][]dp) {
        if(i==prices.length){
            return 0;
        }
        if(dp[i][b]!=-1)return dp[i][b];
        int profit=0;
        if(b==1){
            int take=-prices[i]+helper(prices,i+1,0,dp);
            int not_take= helper(prices,i+1,1,dp);
            profit=Math.max(take,not_take);

        }
        else{
            int take=prices[i]+helper(prices,i+1,1,dp);
            int not_take=helper(prices,i+1,0,dp);
            profit=Math.max(take,not_take);

        }
        return dp[i][b]= profit;
    }

}
