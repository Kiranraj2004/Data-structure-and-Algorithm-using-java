package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

import java.util.Scanner;

public class fibbonacci_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fibo(n));
        System.out.println(tabulationmethod(n));
        System.out.println(spaceoptimization(n));
    }
     static int fibo(int n){
        int[]dp=new int[n+1];
        return helper(dp,n);
     }
     static int helper(int []dp,int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=helper(dp,n-1)+helper(dp,n-2);
        return dp[n];
     }

     static int tabulationmethod (int n){
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
         for (int i = 2; i <=n ; i++) {
             dp[i]=dp[i-1]+dp[i-2];
         }
         return dp[n];
     }
     //    tabulation is also called as bottom approach the below giving code
     static int  spaceoptimization(int n){
        int sum=0;
        int prev=1;
        int prev2=0;
         for (int i = 2; i <=n ; i++) {
             sum=prev+prev2;
             prev2=prev;
             prev=sum;
         }
         return sum;
     }

//     memoization method = topdown method
    static long topDown(int n) {
        // code here
        long []res=new long[n+1];
        return helper(n,res);
    }
    static long helper(int n, long []res){
        if(n<=1){
            return n;
        }
        if(res[n]!=0){
            return res[n];
        }
        res[n]=(helper(n-1,res)+helper(n-2,res))%(long)(Math.pow(10,9)+7);
        return res[n];
    }


//    tabulation is also called as bottom approach
    static long bottomUp(int n) {
        // code here
        long []res=new long[n+1];
        res[0]=0;
        res[1]=1;
        for(int i=2;i<=n;i++){
            res[i]=(res[i-1]+res[i-2])%(long)(Math.pow(10,9)+7);
        }
        return res[n];

    }
}
