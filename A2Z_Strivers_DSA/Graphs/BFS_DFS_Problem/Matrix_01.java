package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix_01 {
    public static void main(String[] args) {
        int[][]mat={{0},
                {0}};
        mat=updateMatrix1(mat);
        for (int i = 0; i < mat.length ; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

    }
//    public static  int[][] updateMatrix(int[][] mat) {
//
//        for (int i = 0; i <mat.length ; i++) {
//            for (int j = 0; j <mat[0].length ; j++) {
//                if (mat[i][j]==1){
//                  mat[i][j]+= helper(mat,i,j);
//                }
//            }
//        }
//        return mat;
//    }

//    private static  int helper(int[][] grid, int r, int c) {
//        Queue<int[]>temp=new LinkedList<>();
//        temp.add(new int[]{r,c});
//        int count=0;
//        while(!temp.isEmpty()){
//            int n= temp.size();
//            while (n>0){
//                int []data=temp.remove();
//                int row=data[0];
//                int col=data[1];
//                if (row-1>=0){
//                    if (grid[row-1][col]!=0)
//                       temp.add(new int[]{row-1,col});
//                    else return count;
//                }
//                if (row+1<grid.length){
//                    if (grid[row+1][col]!=0)
//                      temp.add(new int[]{row+1,col});
//                    else return count;
//                }
//                if (col-1>=0){
//                    if (grid[row][col-1]!=0)
//                        temp.add(new int[]{row,col-1});
//                    else return count;
//
//                }
//                if (col+1<grid[0].length){
//                    if (grid[row][col+1]!=0)
//                       temp.add(new int[]{row,col+1});
//                    else return count;
//                }
//                n--;
//            }
//            count++;
//
//        }
//        return count;
//    }

//    Time Complexity: O(NxM + NxMx4) ~ O(N x M) same for space complexity
    
public static int[][] updateMatrix1(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean[][]visited=new boolean[m][n];
        Queue<int[]>q=new LinkedList<>();
    for (int i = 0; i <m ; i++) {
        for (int j = 0; j <n ; j++) {
            if (mat[i][j]==0){
                q.add(new int[]{i,j,0});
                visited[i][j]=true;
            }
        }
    }
    int[]drow={1,-1,0,0};
    int []dcol={0,0,-1,1};
    while(!q.isEmpty()){
        int[]d=q.poll();
        int r=d[0];
        int c=d[1];
        int index=d[2];
        for (int i = 0; i <4 ; i++) {
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if (nrow>=0&&nrow<mat.length&&ncol>=0&&ncol<mat[0].length&&mat[nrow][ncol]!=0&&!visited[nrow][ncol]){
                visited[nrow][ncol]=true;
                mat[nrow][ncol]+=index;
                q.add(new int[]{nrow,ncol,index+1});
            }

        }

    }
    return mat;
}

}
