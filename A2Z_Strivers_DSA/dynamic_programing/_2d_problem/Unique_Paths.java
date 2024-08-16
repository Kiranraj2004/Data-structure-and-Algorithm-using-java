package A2Z_Strivers_DSA.dynamic_programing._2d_problem;
// https://leetcode.com/problems/unique-paths
public class Unique_Paths {
    public static void main(String[] args) {
        Unique_Paths obj=new Unique_Paths();
        System.out.println(obj.uniquePaths1(3,2));
    }

//    memorization
    public int uniquePaths(int m, int n) {
        int [][]dp=new int [m][n];
        return helper(dp,0,0);
    }

    public int helper(int[][]dp,int row,int col){
        if(row>=dp.length||col>=dp[0].length){
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

//    tabulation
    public int uniquePaths1(int m, int n) {
        int [][]dp=new int [m][n];
        for (int i = 0; i <n ; i++) {
            dp[0][i]=1;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                int sum = 0;
                sum += dp[i - 1][j];
                if (j - 1 >= 0) {
                    sum += dp[i][j - 1];
                }
                dp[i][j] = sum;
            }
        }
        return dp[m-1][n-1];
    }
//    space optimization
    static int countWays(int m, int n) {
        // Create an array to store the results for the previous row
        int []prev = new int[n];

        for (int i = 0; i < m; i++) {
            // Create a temporary array to store the results for the current row
            int []temp = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // Base condition: There's one way to reach the top-left cell (0, 0)
                    temp[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = temp[j - 1];

                // Store the total number of ways to reach the current cell in the temporary array
                temp[j] = up + left;
            }

            // Set the temporary array as the previous array for the next row
            prev = temp;
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return prev[n - 1];
    }
}
