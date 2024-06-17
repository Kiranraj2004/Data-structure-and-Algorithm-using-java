package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int i;
    int j;

    public pair(int i,int j) {
        this.i = i;
        this.j=j;
    }
}
public class Rotting_Oranges {
    public static void main(String[] args) {
        System.out.println();
    }
    public int orangesRotting(int[][] grid) {

        Queue<pair>q=new LinkedList<>();
        int ones=0;
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==2){
                    pair n=new pair(i,j);
                    q.add(n);
                }
                else if(grid[i][j]==1){
                    ones++;
                }
            }
        }
        if (ones==0)return 0;
        if (q.isEmpty())return -1;
        int ans=0;
        int rotten=0;
        while(!q.isEmpty()){
            ans++;
            rotten+=helper(q,grid);
        }
        if ((ones-rotten)!=0){
            return -1;
        }
        return ans;
    }

    private int helper(Queue<pair> q, int[][] grid) {
        int size=q.size();
        int rotten=0;
        while (size>0){
            pair node=q.remove();
            int row=node.i;
            int col=node.j;
            if (row-1>=0&&grid[row-1][col]==1){
                q.add(new pair(row-1,col));
                rotten++;
                grid[row-1][col]=2;
            }
            if (row+1<grid.length&&grid[row+1][col]==1){
                q.add(new pair(row+1,col));
                rotten++;
                grid[row+1][col]=2;
            }
            if (col-1>=0&&grid[row][col-1]==1){
                q.add(new pair(row,col-1));
                rotten++;
                grid[row][col-1]=2;
            }
            if (col+1<grid[0].length&&grid[row][col+1]==1){
                q.add(new pair(row,col+1));
                rotten++;
                grid[row][col+1]=2;
            }
            size--;
        }
        return rotten;
    }
}
