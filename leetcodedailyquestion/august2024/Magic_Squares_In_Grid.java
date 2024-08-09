package leetcodedailyquestion.august2024;

import java.util.HashSet;

public class Magic_Squares_In_Grid {
    public static void main(String[] args) {
        int[][]g={{4,3,8,4},{9,5,1,9},{2,7,6,2}};
        System.out.println(numMagicSquaresInside(g));

    }
    public static int numMagicSquaresInside(int[][] grid) {
        int count=0;
        for (int i = 0; i <=grid.length-3 ; i++) {
            for (int j = 0; j <=grid[0].length-3 ; j++) {
                count+= ismagic(grid, i, j)  ? 1 : 0;
            }
        }
        return count;

    }

    private static boolean ismagic(int[][] arr, int row, int col) {

        HashSet<Integer>map=new HashSet<>();
        for (int i = 0; i <3 ; i++) {
            int row1=row+i;
            int col1=col+i;
            int colsum=(arr[row][col1]+arr[row+1][col1]+arr[row+2][col1]);
            int rowsum=(arr[row1][col]+arr[row1][col+1]+arr[row1][col+2]);
            if(i==0) {
                int digonalsum1 = (arr[row][col] + arr[row + 1][col + 1] + arr[row + 2][col + 2]);
                int digonalsum2 = (arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col]);
                if(digonalsum1!=15||digonalsum2!=15){
                    return false;
                }
            }
            if(colsum!=15||rowsum!=15){
                return false;
            }
           if (arr[row][col1]<=9&&!map.contains(arr[row][col1]))map.add(arr[row][col1]);else return false;
           if (arr[row+1][col1]<=9&&!map.contains(arr[row+1][col1]))map.add(arr[row+1][col1]);else return false;
           if (arr[row+2][col1]<=9&&!map.contains(arr[row+2][col1]))map.add(arr[row+2][col1]);else return false;

        }
        return map.size() >= 9;
    }
}
