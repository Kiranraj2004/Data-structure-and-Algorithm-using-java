package A2Z_Strivers_DSA.dynamic_programing;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock obj=new Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));

    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=prices[n-1];
        int ans=0;
        for(int i=n-2;i>=0;i--){
            if(prices[i]>maxprofit){
                maxprofit=prices[i];
            }
            else{
                ans=Math.max(ans,maxprofit-prices[i]);
            }
        }
        return ans;
    }
}
