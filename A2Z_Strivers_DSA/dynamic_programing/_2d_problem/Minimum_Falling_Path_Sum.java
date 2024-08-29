package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

public class Minimum_Falling_Path_Sum {

//    memoization mt
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int [][]dp=new int [n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n ; i++) {
            min=Math.min(min,helper(matrix,dp,n-1,i));
        }
        return min;
    }

    private int helper(int[][] matrix, int[][] dp, int row, int col) {
        if(row==0){
           return  matrix[row][col];
        }
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        int min=Integer.MAX_VALUE;
//        same index
            min=Math.min(min,helper(matrix,dp,row-1,col));
//        col-1 coloumn
        if(col-1>=0){
            min=Math.min(min,helper(matrix,dp,row-1,col-1));
        }

//        col +1 coloumn
        if(col+1<matrix.length){
            min=Math.min(min,helper(matrix,dp,row-1,col+1));
        }
        min+=matrix[row][col];
        return dp[row][col]=min;
    }
}
