//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class Count_negative_numberinmatrix {
    public static void main(String[] args) {
        int [][]arr={
                {4,3,2,-1},
                {-1,-1,-2,-3},
                {3,2,1,-1}
        };

        System.out.println(negetive_number(arr));
    }
    public static int negetive_number(int[][]grid){
        int answer=0;
        for (int row = 0; row < grid.length ; row++) {
            for (int col = 0; col < grid[0].length ; col++) {
                if (grid[row][col]<0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
