package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

public class Geek_Jump {
    public static void main(String[] args) {
        int[]arr={10 ,20, 30, 10};
        System.out.println(minimumEnergy(arr,arr.length));

    }

//    using memoization
    public static int minimumEnergy(int arr[],int n){
        //code here
        int []dp=new int[arr.length];
        return helper(arr,n-1,dp);

    }
     public static int helper(int arr[],int n,int[]dp){
         if(n==0){
             return 0;
         }
         if(dp[n]!=0){
             return dp[n];
         }
         int jumpone=helper(arr,n-1,dp)+Math.abs(arr[n]-arr[n-1]);
         int jumptwo=Integer.MAX_VALUE;
         if(n>1){
             jumptwo=helper(arr,n-2,dp)+Math.abs(arr[n]-arr[n-2]);
         }
         dp[n]=Math.min(jumpone,jumptwo);
         return dp[n];
     }

//     tabulation
    public static int minimumEnergy1(int arr[],int n){
        //code here
//        int dp[]=new int[n];
//        dp[0]=0;
//        for(int ind=1;ind<n;ind++){
//            int jumpTwo = Integer.MAX_VALUE;
//            int jumpOne= dp[ind-1] + Math.abs(arr[ind]-arr[ind-1]);
//            if(ind>1)
//                jumpTwo = dp[ind-2] + Math.abs(arr[ind]-arr[ind-2]);
//
//            dp[ind]=Math.min(jumpOne, jumpTwo);
//        }
//        return dp[n-1];
//        space optimization

        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){

            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= prev + Math.abs(arr[i]-arr[i-1]);
            if(i>1)
                jumpTwo = prev2 + Math.abs(arr[i]-arr[i-2]);

            int cur_i=Math.min(jumpOne, jumpTwo);
            prev2=prev;
            prev=cur_i;
        }
        return prev;
    }
}
