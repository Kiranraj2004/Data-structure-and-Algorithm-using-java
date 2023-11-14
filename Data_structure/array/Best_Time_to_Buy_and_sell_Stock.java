package array;

public class Best_Time_to_Buy_and_sell_Stock {
    public static void main(String[] args) {
        int []prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
      int min=0;
        for (int i =0; i < prices.length ; i++) {
            if (prices[i]<prices[min]){
                min=i;
            }
        }
        if (min==prices.length-1){
               return 0;
           }
        int max=min;
        for (int i = min; i < prices.length; i++) {
            if (prices[i]>=prices[max]){
                max=i;
            }
        }
        return prices[max]-prices[min];

    }
}
