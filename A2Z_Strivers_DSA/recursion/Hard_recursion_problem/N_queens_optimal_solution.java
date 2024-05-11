package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class N_queens_optimal_solution {
    public static void main(String[] args) {
        System.out.println(solveNQueens(5));

    }
    public static  List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                board[i][j]='.';
            }
        }
        int []columcheck=new int[n];
        int []lowercheck=new int[2*n-1];
        int[] uppercheck=new int[2*n-1];
        List<List<String >>res=new ArrayList<>();
        helper(0,board,columcheck,lowercheck,uppercheck,res);
        return res;
    }

    private static void helper(int col, char[][] board, int[] columcheck, int[] lowercheck, int[] uppercheck, List<List<String>> res) {
        if (col==board.length){
            res.add(setvalue(board));
            return;
        }
        for (int row = 0; row <board.length ; row++) {
            if (columcheck[row]==0&&lowercheck[row+col]==0&&uppercheck[board.length-1+row-col]==0){
                board[row][col]='Q';
                columcheck[row]=1;
                lowercheck[row+col]=1;
                uppercheck[board.length-1+row-col]=1;
                helper(col+1,board,columcheck,lowercheck,uppercheck,res);
                board[row][col]='.';
                columcheck[row]=0;
                lowercheck[row+col]=0;
                uppercheck[board.length-1+row-col]=0;
            }
        }
    }

    private static List<String> setvalue(char[][] board) {
        List<String>s=new ArrayList<>();
        for (int i = 0; i <board.length ; i++) {
            String a=new String(board[i]);
            s.add(a);
        }
        return s;
    }
}
