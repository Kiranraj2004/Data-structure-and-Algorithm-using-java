package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

public class Knapsack_with_Duplicate_Items {
    public static void main(String[] args) {
        System.out.println(knapSack1(4,8,new int[]{6, 1, 7, 7},new int[]{1, 3, 4, 5}));

    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int [][]dp=new int[N][W+1];
        // code here
        return helper(W,val,wt,N-1,dp);
    }

    private static int helper(int weight, int[] val, int[] wt, int index,int [][]dp) {
        if(index<0||weight==0){
            return 0;
        }
        if(dp[index][weight]!=0)return dp[index][weight];
        int take=0;
        if(wt[index]<=weight){
            take=val[index]+helper(weight-wt[index],val,wt,index,dp);
        }
        int nottake=helper(weight,val,wt,index-1,dp);
        return dp[index][weight]= Math.max(take,nottake);
    }
    static int knapSack1(int N, int W, int val[], int wt[])
    {
        int [][]dp=new int[N][W+1];
        for (int i = wt[0]; i <=W ; i++) {
            dp[0][i]=((int)i/wt[0])*val[0];
        }
        for (int index = 1; index <N ; index++) {
            for (int cap = 0; cap <=W ; cap++) {
                int nottake=dp[index-1][cap];
                int take=Integer.MIN_VALUE;
                if(wt[index]<=cap){
                    take=val[index]+dp[index-1][cap-wt[index]];
                }
                dp[index][cap]=Math.max(take,nottake);
            }
        }
        return dp[N-1][W];
    }

}
