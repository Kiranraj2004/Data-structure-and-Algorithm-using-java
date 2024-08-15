package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

import com.sun.tools.jconsole.JConsoleContext;

public class Geeks_Training {
    public static void main(String[] args) {
        int[][] arr={{1,2,5},{3,1,1,3},{3,3,3}};
        System.out.println(maximumPoints1(arr,arr.length));
    }
    public static  int maximumPoints(int arr[][], int N) {
        int [][]dp=new int[N][3];
        return helper(arr,dp,-1,N-1);
    }
    public static int helper(int[][]arr,int [][]dp,int prev,int row){
        if(row<0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <3 ; i++) {
            if(i==prev)continue;
            if(dp[row][i]!=0){
                max=Math.max(max,dp[row][i]);
                continue;
            }
            int res=helper(arr,dp,i,row-1)+arr[row][i];
            dp[row][i]=res;
            max=Math.max(max,res);
        }
       return  max;
    }

    public static int maximumPoints1(int arr[][], int N) {
        // code here
        int [][]dp=new int [N][3];
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        for (int i = 1; i <N ; i++) {
            for (int j = 0; j <3 ; j++) {
                int max=Integer.MIN_VALUE;
                for (int k = 0; k <3 ; k++) {
                    if(k==j) continue;
                    max=Math.max(max,dp[i-1][k]);
                }
                dp[i][j]=max+arr[i][j];
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <3 ; i++) {
            max=Math.max(max,dp[N-1][i]);
        }
        return max;
    }
}
