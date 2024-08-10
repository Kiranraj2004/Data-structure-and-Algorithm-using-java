package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

public class Minimal_Cost {
    public static void main(String[] args) {
        int k = 3;
        int  arr[]= {10, 30, 40, 50, 20};
        System.out.println(minimizeCost1(arr,3));

    }

//    memorization top bottom
    public static  int minimizeCost(int arr[], int k) {
        int []dp=new int [arr.length];
        return helper(arr,dp,0,k);

    }

    private static int helper(int[] arr, int[] dp, int index, int k) {
        if(index==arr.length-1)return 0;
        if(dp[index]!=0)return dp[index];
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <=k&&index+i<arr.length ; i++) {
                int jump=helper(arr,dp,index+i,k)+Math.abs(arr[index]-arr[index+i]);
                min=Math.min(jump,min);
        }
        dp[index]=min;
        return dp[index];
    }

//    tabulation bottom up approach
    public static int minimizeCost1(int arr[], int k) {
        // code here
        int []dp=new int[arr.length];
        for (int i = 1; i <arr.length ; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 1; j <=k &&i-j>=0 ; j++) {
                int jump=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                min=Math.min(jump,min);
            }
            dp[i]=min;
        }
        return  dp[arr.length-1];

    }
}
