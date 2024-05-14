package leetcodedailyquestion.May2024;

public class Path_with_Maximum_Gold {
    public static void main(String[] args) {
        int [][]grid = {{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(grid));


    }

//    Time complexity: \(O(4^N)\), where \(N\) is the number of cells in the grid. In the worst-case scenario, the helper function explores all possible directions for each cell, resulting in a branching factor of 4 for each cell.
//
//    Space complexity: \(O(N^2)\), where \(N\) is the number of rows or columns in the grid. This is due to the boolean array \(t\) used to track visited cells. Additionally, the recursion depth can reach \(N^2\) in the worst case, leading to additional space usage on the call stack.
    public static int getMaximumGold(int[][] grid) {
        boolean[][]t=new boolean[grid.length][grid[0].length];
        int[]res=new int[1];
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]!=0){
                    t[i][j]=true;
                    helper(grid,i,j,grid[i][j],t,res);
                    t[i][j]=false;
                }
            }
        }
        return res[0];

    }

    private static void helper(int[][] grid, int i, int j, int sum, boolean[][] a, int[] res) {
        if (res[0]<sum){
            res[0]=sum;
        }

//        right condition
        if (j+1<grid[i].length&&grid[i][j+1]!=0&&a[i][j+1]==false){
            a[i][j+1]=true;
            sum+=grid[i][j+1];
            helper(grid,i,j+1,sum,a,res);
            sum-=grid[i][j+1];
            a[i][j+1]=false;
        }
//        left condition
        if (j-1>=0&&grid[i][j-1]!=0&&a[i][j-1]==false){
            a[i][j-1]=true;
            sum+=grid[i][j-1];
            helper(grid,i,j-1,sum,a,res);
            sum-=grid[i][j-1];
            a[i][j-1]=false;
        }
//        upper condition
        if (i-1>=0&&grid[i-1][j]!=0&&a[i-1][j]==false){
            a[i-1][j]=true;
            sum+=grid[i-1][j];
            helper(grid,i-1,j,sum,a,res);
            sum-=grid[i-1][j];
            a[i-1][j]=false;
        }
//        lower condition
        if (i+1<grid.length&&grid[i+1][j]!=0&&a[i+1][j]==false){
            a[i+1][j]=true;
            sum+=grid[i+1][j];
            helper(grid,i+1,j,sum,a,res);
            sum-=grid[i+1][j];
            a[i+1][j]=false;
        }
    }
}

