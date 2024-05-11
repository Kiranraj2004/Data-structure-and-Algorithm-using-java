package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_II {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    public static int totalNQueens(int n) {
        char[][]board=new char[n][n];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                board[i][j]='.';
            }
        }
        int []columcheck=new int[n];
        int []lowercheck=new int[2*n-1];
        int []uppercheck=new int[2*n-1];

        return helper(0,board,columcheck,lowercheck,uppercheck);
    }
    private static int helper(int col, char[][] board, int[] columcheck, int[] lowercheck, int[] uppercheck) {
        if (col==board.length){
            return 1;
        }
        int way=0;
        for (int row = 0; row <board.length ; row++) {
            if (columcheck[row]==0&&lowercheck[row+col]==0&&uppercheck[board.length-1+row-col]==0){
                board[row][col]='Q';
                columcheck[row]=1;
                lowercheck[row+col]=1;
                uppercheck[board.length-1+row-col]=1;
                way+=helper(col+1,board,columcheck,lowercheck,uppercheck);
                board[row][col]='.';
                columcheck[row]=0;
                lowercheck[row+col]=0;
                uppercheck[board.length-1+row-col]=0;
            }
        }
        return way;
    }
}
