package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

import java.util.PriorityQueue;

class pair{
    int distance;
    int row ;
    int col;
    pair(int dist,int row,int col){
        distance=dist;
        this.row=row;
        this.col=col;
    }
}
//
public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int [][]arr={{1,3,1},{1,5,1},{4,2,1}};
        Minimum_Path_Sum obj=new Minimum_Path_Sum();
        System.out.println(obj.minPathSum3(arr));

    }
    public int minPathSum(int[][] grid) {
        PriorityQueue<pair>q=new PriorityQueue<>((x,y)->x.distance-y.distance);
        int m=grid.length;
        int n=grid[0].length;
        q.add(new pair(grid[0][0],0,0));
        while(!q.isEmpty()){
            int distance=q.peek().distance;
            int row=q.peek().row;
            int col=q.peek().col;
            q.poll();
            if(row==m-1&&col==n-1)return distance;
//            right move
            if(col+1<n){
                q.add(new pair(grid[row][col+1]+distance,row,col+1));
            }
//            down  move
            if(row+1<m){
                q.add(new pair(grid[row+1][col]+distance,row+1,col));
            }
        }
        return -1;

    }
//    memoization top-down approach
    public int minPathSum1(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        return helper(grid,dp,0,0);
    }

    private int helper(int[][] g, int[][] dp, int row, int col) {
        if(row>= g.length||col>=g[0].length){
            return Integer.MAX_VALUE;
        }
        if(row== g.length-1&&col==g[0].length-1){
            return g[g.length-1][g[0].length-1];
        }
        if(dp[row][col]!=0)return dp[row][col];
        int min=Integer.MAX_VALUE;
//        right move
        min=helper(g,dp,row,col+1);
//        down move
        min=Math.min(min,helper(g,dp,row+1,col));
        min+=g[row][col];
       return dp[row][col]=min;
    }

//     tabulation
    public int minPathSum2(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0&&j==0)continue;
                int min=Integer.MAX_VALUE;
//                left check
                if (j>0){
                    min=dp[i][j-1];
                }
                if(i>0){
                    min=Math.min(min,dp[i-1][j]);
                }
                min+=grid[i][j];
                dp[i][j]=min;
            }
        }
        return dp[m-1][n-1];
    }

    public int minPathSum3(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int []prev=new int[n];
        prev[0]=grid[0][0];
        for (int i = 0; i <m ; i++) {
            int[] current=new int[n];
            for (int j = 0; j <n ; j++) {
                if (i==0&&j==0){ current[0]=prev[0];
                    continue;
                }
                int min=Integer.MAX_VALUE;
//                left check
                if (j>0){
                    min=current[j-1];
                }
                if(i>0){
                    min=Math.min(min,prev[j]);
                }
                min+=grid[i][j];
               current[j]=min;
            }
            prev=current;
        }
        return prev[n-1];
    }
}
//space optimization

