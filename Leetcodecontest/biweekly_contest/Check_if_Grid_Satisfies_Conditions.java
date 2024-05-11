package Leetcodecontest.biweekly_contest;

import java.util.HashSet;

public class Check_if_Grid_Satisfies_Conditions {
    public static void main(String[] args) {

    }
    public boolean satisfiesConditions(int[][] grid) {

        for (int i = 0; i <grid[0].length ; i++) {
            for (int j = 0; j <grid.length ; j++) {
               if (j+1<grid.length&&grid[j][i]!=grid[j+1][i]){
                   return false;
               }
            }
        }
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
               if (j+1<grid[0].length&&grid[i][j]==grid[i][j+1])return false;
            }

        }
        return true;

    }
}
