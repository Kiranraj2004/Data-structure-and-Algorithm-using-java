package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

public class Unique_Paths_II {
    public static void main(String[] args) {
        Unique_Paths_II obj =new Unique_Paths_II();
        int [][]arr={
                {0,0,0},
                {0,0,0},
                {1,0,0},
        };
        System.out.println(obj.uniquePathsWithObstacles1(arr));
//        System.out.println(1/10);

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for (int i = 0; i <obstacleGrid.length ; i++) {
            for (int j = 0; j <obstacleGrid[0].length ; j++) {
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=-1;
                }
            }
        }
        return helper(obstacleGrid,0,0);
    }

    private int helper(int[][] dp, int row, int col) {
        if(row>=dp.length||col>=dp[0].length){
            return 0;
        }
        if(dp[row][col]==-1){
            return 0;
        }
        if(row==dp.length-1&&col==dp[0].length-1){
            return 1;
        }
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        int sum=0;
//        right move
        sum+=helper(dp,row,col+1);
//        down move
        sum+=helper(dp,row+1,col);
        return dp[row][col]=sum;
    }
    public int uniquePathsWithObstacles1(int[][] dp) {
        int m=dp.length;
        int n=dp[0].length;
        if(dp[0][0]==1||dp[m-1][n-1]==1)return 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(dp[i][j]==1){
                    dp[i][j]=-1;
                }
            }
        }
        dp[0][0]=1;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(dp[i][j]==-1||(i==0&&j==0)){
                    continue;
                }
                int sum=0;
//                left
                if(j>0&&dp[i][j-1]!=-1){
                    sum+=dp[i][j-1];
                }
//                up check
                if(i>0&&dp[i-1][j]!=-1){
                    sum+=dp[i-1][j];
                }
                dp[i][j]=sum;

            }

        }
        return dp[m-1][n-1];
    }
//     space optimization
    static int mazeObstacles(int n, int m, int[][] maze) {
        // Initialize the previous row of the DP matrix
        int prev[] = new int[n];

        for (int i = 0; i < n; i++) {
            // Create a temporary array for the current row
            int temp[] = new int[m];

            for (int j = 0; j < m; j++) {
                // Base conditions
                if (i > 0 && j > 0 && maze[i][j] == -1) {
                    temp[j] = 0; // If there's an obstacle, no paths can go through here.
                    continue;
                }
                if (i == 0 && j == 0) {
                    temp[j] = 1; // There's one valid path to the start cell.
                    continue;
                }

                int up = 0;
                int left = 0;

                // Check if moving up is possible
                if (i > 0)
                    up = prev[j];

                // Check if moving left is possible
                if (j > 0)
                    left = temp[j - 1];

                // Calculate the number of paths by adding paths from above and from the left
                temp[j] = up + left;
            }

            // Update the previous row with the values of the current row
            prev = temp;
        }

        // The final result is stored in the last element of the previous row
        return prev[n - 1];
    }

}
