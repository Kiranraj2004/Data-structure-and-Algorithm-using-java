package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

import java.util.Arrays;

public class Surrounded_Regions {
    public static void main(String[] args) {
        char[][] b = {
                {'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X'}
        };
        solve(b);
        for(char[]s:b){
            System.out.println(Arrays.toString(s));
        }

    }
    public static void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean [][]visited=new boolean[m][n];
//        top boarder check
        for (int i = 0; i <n ; i++) {
            if (board[0][i]=='O'&&!visited[0][i]){
                dfs(board,visited,0,i);
            }
        }
        //        bottom boarder check
        for (int i = 0; i <n&&m-1>0  ; i++) {
            if (board[m-1][i]=='O'&&!visited[m-1][i]){
                dfs(board,visited,m-1,i);
            }
        }
        //        left boarder check
        for (int i = 1; i <m-1 ; i++) {
            if (board[i][0]=='O'&&!visited[i][0]){
                dfs(board,visited,i,0);
            }
        }
        //        right boarder check
        for (int i = 1; i <m-1&&n-1>0 ; i++) {
            if (board[i][n-1]=='O'&&!visited[i][n-1]){
                dfs(board,visited,i,n-1);
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (board[i][j]=='O'&&!visited[i][j]){
                    board[i][j]='X';
                }
            }
        }


    }

    private static void dfs(char[][] board, boolean[][] visited, int r, int c) {
        visited[r][c]=true;
        int []drow={-1,1,0,0};
        int []dcol={0,0,-1,1};
        for (int i = 0; i < 4 ; i++) {
            int row=r+drow[i];
            int col=c+dcol[i];
            if (row>=0&&row<board.length&&col>=0&&col<board[0].length&&board[row][col]=='O'&&!visited[row][col]){
                dfs(board, visited, row, col);
            }
        }
    }
}
