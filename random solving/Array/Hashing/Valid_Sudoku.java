package Array.Hashing;

import java.util.HashMap;

public class Valid_Sudoku {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer>ro=new HashMap<>();
        HashMap<Character,Integer>co=new HashMap<>();
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if (board[i][j]!='.'){
                    if (ro.containsKey(board[i][j])){
                        return false;
                    }
                    else{
                        ro.put(board[i][j],1);
                    }
                }
               if (board[j][i]!='.'){
                   if (co.containsKey(board[j][i])){
                       return false;
                   }else{
                       co.put(board[j][i],1);
                   }
               }
            }
        }
        for (int i = 0; i < board.length ; i++) {

            for (int j = 0; j < board.length; j++) {

            }
        }

        return true;
    }
}
