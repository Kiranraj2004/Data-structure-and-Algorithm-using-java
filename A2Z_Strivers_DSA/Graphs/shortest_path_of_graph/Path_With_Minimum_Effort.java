package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;


import java.util.PriorityQueue;

public class Path_With_Minimum_Effort {
    public static void main(String[] args) {
        int [][]a={{10,8},{10,8},{1,2},{10,3},{1,3},{6,3},{5,2}};

        System.out.println(minimumEffortPath(a));
    }
    public static  int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        PriorityQueue<pair>q=new PriorityQueue<>((x,y)-> x.distance - y.distance);
        q.add(new pair(0,0,0));
        boolean[][]f=new boolean[n][m];

        int[]drow={-1,1,0,0};
        int[]dcol={0,0,-1,1};
        while(!q.isEmpty()){
            int max=q.peek().distance;
            int i=q.peek().i;
            int j=q.peek().j;
            q.poll();
            f[i][j]=true;
            int element=heights[i][j];
            if (i==n-1&&j==m-1)return max;
            for (int k = 0; k <drow.length ; k++) {
                int i1=i+drow[k];
                int j1=j+dcol[k];
                if (i1>=0&&i1<n&&j1>=0&&j1<m&&!f[i1][j1]){
                    int e=Math.abs(heights[i1][j1]-element);

                    if (e>max){
                        q.add(new pair(e,i1,j1));
                    }
                    else{
                        q.add(new pair(max,i1,j1));
                    }
                }
            }
        }
        return 0;
    }
}
