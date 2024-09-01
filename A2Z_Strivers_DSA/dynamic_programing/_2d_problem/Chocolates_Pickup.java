package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

import java.util.Arrays;

public class Chocolates_Pickup {
    public static void main(String[] args) {
     int [][]grid={{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
     Chocolates_Pickup obj=new Chocolates_Pickup();
        System.out.println(obj.solve(4,3,grid));
    }

//    memoization
//    which time complexity of o(n*m*m)+O(9)
//    which space complexity of o(n*m*m)+O(n)
    public int solve(int n, int m, int grid[][]) {
        // Code here
        int [][][]dp=new int [n][m][m];
        int res= helper(grid,dp,0,0,m-1);
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                    System.out.println(Arrays.toString(dp[i][j]));
            }
        }
        return res;
    }
    private int helper(int[][] grid, int[][][] dp, int i, int j1, int j2) {
        if(j1<0||j1>=grid[0].length||j2<0||j2>=grid[0].length){
            return Integer.MIN_VALUE;
        }
        if(i==grid.length-1){
            if(j1==j2)return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=0)return dp[i][j1][j2];
        int max=Integer.MIN_VALUE;
        for (int robo1 = -1; robo1 <=1 ; robo1++) {
            for (int robo2 = -1; robo2 <=1 ; robo2++) {
                if(j1==j2){
                    max=Math.max(max,(grid[i][j1]+helper(grid,dp,i+1,j1+robo1,j2+robo2)));
                }
                else{
                    max=Math.max(max,(grid[i][j1]+grid[i][j2]+helper(grid,dp,i+1,j1+robo1,j2+robo2)));
                }
            }
        }
        return dp[i][j1][j2]=max;
    }
}
