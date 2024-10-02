package A2Z_Strivers_DSA.dynamic_programing.best_stocks;
import java.util.*;
public class Best_Time_to_Buy_and_Sell_Stock_III {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_III obj=new Best_Time_to_Buy_and_Sell_Stock_III();
        System.out.println(obj.maxProfit1(new int[]{3,3,5,0,0,3,1,4}));

    }

//    memoization method
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][][]dp=new int[n][2][3];
        int i=0;
        for(int[][] row:dp) {
            for(int[]r:row){
                Arrays.fill(r,-1);
            }
        }
        return helper(prices,0,1,dp,2);
    }

    private int helper(int[] prices, int i, int b,int[][][]dp,int t) {
        if(i==prices.length||t==0){
            return 0;
        }
        if(dp[i][b][t]!=-1)return dp[i][b][t];
        int profit=0;
        if(b==1){
            int not_take= helper(prices,i+1,1,dp,t);
            int take=-prices[i]+helper(prices,i+1,0,dp,t);
            profit=Math.max(take,not_take);
        }
        else{
            int take=prices[i]+helper(prices,i+1,1,dp,t-1);
            int not_take=helper(prices,i+1,0,dp,t);
            profit=Math.max(take,not_take);
        }
        return dp[i][b][t]= profit;
    }
    public int maxProfit1(int[] prices) {
        int n=prices.length;
        int [][][]dp=new int[n+1][2][3];
       for(int index=n-1;index>=0;index--){
           for (int buy =0; buy <=1; buy++) {
               for (int cap = 1; cap <=2 ; cap++) {
                   if(buy==1){
                       int take=-prices[index]+dp[index+1][0][cap];
                       int not_take= dp[index+1][1][cap];
                       dp[index][buy][cap]=Math.max(take,not_take);
                   }
                   else{
                       int take=prices[index]+dp[index+1][1][cap-1];
                       int not_take= dp[index+1][0][cap];
                       dp[index][buy][cap]=Math.max(take,not_take);
                   }
               }
           }
       }
        return dp[0][1][2];
    }
}
