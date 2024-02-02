package Array.sliding_window;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[]nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int start=0;
        int end=1;
        int max=0;
        while (end<prices.length){
            if (prices[start]>prices[end]){
                start++;
            }else {
                max=Math.max(max,prices[end]-prices[start]);
            }
            end++;
        }
          return max;
    }
}
