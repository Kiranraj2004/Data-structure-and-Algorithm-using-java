package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

//    memoization  top-down approach
    public static  int climbStairs(int n) {
        int []dp=new int [n+1];
        return helper(n,dp);
    }
    public static int helper(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0)return 0;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]+=helper(n-1,dp)+ helper(n-2,dp);
        return dp[n];
    }

//    tabulation bottom up approach
 public static  int climbStairs1(int n) {
//        int []dp=new int[n+1];
//        dp[0]=1;
//        dp[1]=1;
//     for (int i = 2; i <=n ; i++) {
//         dp[i]=dp[i-1]+dp[i-2];
//     }
//        return dp[n];

//     space optimization
     int prev=1;
     int prev1=1;
     for (int i = 2; i <=n; i++) {
         int sum=prev+prev1;
         prev1=prev;
         prev=sum;

     }
     return prev;

 }
}
