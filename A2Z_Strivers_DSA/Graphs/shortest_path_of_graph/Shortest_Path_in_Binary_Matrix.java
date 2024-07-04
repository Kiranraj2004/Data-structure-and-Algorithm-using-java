package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.PriorityQueue;

class pair{
    int distance;
    int i;
    int j;
    public pair(int d,int i,int j) {
        this.distance=d;
        this.j=j;
        this.i = i;
    }
}
public class Shortest_Path_in_Binary_Matrix {
    public static void main(String[] args) {
        int[][]m={{0,0,0},{0,0,1},{1,1,0}};
        System.out.println(shortestPathBinaryMatrix(m));

    }
//    time complexity O(N*log(N))
//    space complexity O(N*N)
    public static  int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if (grid[0][0]==1||grid[n-1][n-1]==1)return -1;
        int[][]temp=new int[n][n];
        PriorityQueue<pair>q=new PriorityQueue<>((x,y) -> x.distance - y.distance);
        temp[0][0]=1;
        q.add(new pair(1,0,0));
        int []drow={-1,1,0,0,-1,-1,1,1};
        int []dcol={0,0,-1,1,-1,1,-1,1};
        while(!q.isEmpty()){
            int d=q.peek().distance;
            int i=q.peek().i;
            int j=q.peek().j;
            q.poll();
            for (int k = 0; k <drow.length ; k++) {
                int i1=i+drow[k];
                int j1=j+dcol[k];
                if (i1>=0&&i1<n&&j1>=0&&j1<n&&grid[i1][j1]==0){
                    if (i1==n-1&&j1==n-1)return d+1;
                    if (temp[i1][j1]==0){
                        temp[i1][j1]=d+1;
                        q.add(new pair(d+1,i1,j1));
                    }
                    else if(temp[i1][j1]>d+1){
                        temp[i1][j1]=d+1;
                        q.add(new pair(d+1,i1,j1));
                    }
                }
            }
        }
        return -1;
    }
}
