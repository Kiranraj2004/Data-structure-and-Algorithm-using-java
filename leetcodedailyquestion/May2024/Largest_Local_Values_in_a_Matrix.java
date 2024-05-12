package leetcodedailyquestion.May2024;
//12/05/2024
import java.util.Arrays;

public class Largest_Local_Values_in_a_Matrix {

    public static void main(String[] args) {
        int[][]grid= {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.toString(largestLocal(grid)));

    }
    public static  int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j <ans.length ; j++) {
                int max=0;
                for (int k =i ; k <i+3; k++) {
                    for (int l = j;l <j+3 ; l++) {
                        max=Math.max(max,grid[k][l]);
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }

}
