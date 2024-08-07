package A2Z_Strivers_DSA.dynamic_programing;

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
}
