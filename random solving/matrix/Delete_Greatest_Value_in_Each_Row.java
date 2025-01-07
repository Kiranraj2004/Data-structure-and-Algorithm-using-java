package Matrix;

import java.util.Arrays;

public class Delete_Greatest_Value_in_Each_Row {
    public static void main(String[] args) {
        int[][]grid={
                {10}

        };
        System.out.println(deleteGreatestValue(grid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        int answer=0;
        for (int n = 0 ; n < grid.length ; n++)
        {
            Arrays.sort(grid[n]);
        }
        for (int i = grid[0].length-1; i >= 0 ; i--) {
            int maxVal=Integer.MAX_VALUE;
            for (int j = 0; j < grid.length; j++) {
                int[] row = grid[j];
                maxVal = Math.max(maxVal, row[i]);
            }
        }
return answer;
    }
}
