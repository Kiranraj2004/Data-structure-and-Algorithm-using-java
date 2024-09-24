package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

public class Rod_Cutting {
    public static void main(String[] args) {
        Rod_Cutting obj=new Rod_Cutting();
        System.out.println(obj.cutRod1(new int[]{3, 5, 8, 9, 10, 17, 17, 20},8));

    }
    public int cutRod(int []price, int n) {
        int [][]dp=new int[n][n+1];
        return helper(price,n,n-1,dp);
    }
    public static int helper(int []price,int length,int index,int [][]dp){
        if(index<0){
            return 0;
        }
        if(dp[index][length]!=0)return dp[index][length];
        int take=Integer.MIN_VALUE;
        if(index+1<=length){
            take=price[index]+helper(price,length-(index+1),index,dp);
        }
        int nottake=helper(price,length,index-1,dp);
        return dp[index][length]= Math.max(take,nottake);
    }
    public int cutRod1(int []price, int n) {
        int [][]dp=new int[n][n+1];
        for (int i = 1; i<=n ; i++) {
            dp[0][i]=(n/i)*price[0];
        }
        for (int index = 1; index <n ; index++) {
            for (int cap = 0; cap <=n; cap++) {
                int nottake=dp[index-1][cap];
                int  take=Integer.MAX_VALUE;
                if(cap>=index){
                    take=price[index]+dp[index-1][cap-index];
                }
                dp[index][cap]=Math.max(take,nottake);
            }
        }

        return dp[n-1][n];
    }
}
