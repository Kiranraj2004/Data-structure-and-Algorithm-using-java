package Matrix;
//https://leetcode.com/problems/richest-customer-wealth
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int [][]accounts={{1,2,3,4}
        ,{3,2,1,2,3}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length ; i++) {
            int sum=0;
            for (int j = 0; j <accounts[i].length ; j++) {
                sum+=accounts[i][j];
            }
           if (max<sum){
              max=sum;
           }

        }
return max;
    }
}
