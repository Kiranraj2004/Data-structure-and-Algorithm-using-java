package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class N_Queens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(3));
    }


//    Time Complexity: Exponential in nature since we are trying out all ways, to be precise its O(N! * N).
//
//    Space Complexity: O( N2 )
    public static List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                board[i][j]='.';
            }
        }
        List<List<String>>res=new ArrayList<List<String>>();
        helper(0,board,res);
        return res;
    }

    private static void helper(int col, char[][] board, List<List<String>> res) {
        if (col==board.length){
            res.add(set(board));
            return;
        }
        for (int row = 0; row <board.length ; row++) {
            if (issafe(board,col,row)){
                board[row][col]='Q';
                helper(col+1,board,res);
                board[row][col]='.';
            }
        }
    }

    private static List<String> set(char[][] board) {
        List<String>s=new ArrayList<>();
        for (int i = 0; i <board.length ; i++) {
            String a=new String(board[i]);
            s.add(a);
        }
        return s;
    }

    private static boolean issafe(char[][] board, int col, int row) {
        int temprow=row;
        int tempcol=col;
        while (tempcol>=0){
            if (board[temprow][tempcol]=='Q')return false;
            tempcol--;
        }
        tempcol=col;
        while(temprow>=0&&tempcol>=0){
            if (board[temprow][tempcol]=='Q')return false;
            temprow--;
            tempcol--;
        }
        tempcol=col;
        temprow=row;
        while(temprow<board.length&&tempcol>=0){
            if (board[temprow][tempcol]=='Q')return false;
            temprow++;
            tempcol--;
        }
        return true;
    }
}
