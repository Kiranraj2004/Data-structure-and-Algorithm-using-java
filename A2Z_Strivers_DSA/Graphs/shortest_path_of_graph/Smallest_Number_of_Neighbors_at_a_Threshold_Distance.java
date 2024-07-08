package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.PriorityQueue;

public class Smallest_Number_of_Neighbors_at_a_Threshold_Distance {
    public static void main(String[] args) {
        int[][]a={{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        System.out.println(findTheCity(4,a,4));
    }
    public static  int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][]arr=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==j){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=(int)1e8;
                }
            }
        }
        for (int i = 0; i <edges.length ; i++) {
            int u=edges[i][0];
            int v=edges[i][1];
            int weight=edges[i][2];
            arr[u][v]=weight;
            arr[v][u]=weight;
        }
        for (int via = 0; via <n ; via++) {
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    arr[i][j]=Math.min(arr[i][j],arr[i][via]+arr[via][j]);
                }
            }
        }
        PriorityQueue<int[]>q=new PriorityQueue<>((x,y)->x[0]-y[0]);
        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <n ; j++) {
                if (arr[i][j]<=distanceThreshold&&i!=j){
                    count++;
                }
            }
            q.add(new int[]{count,i});
        }
        if (q.isEmpty())return -1;
        int min=q.peek()[0];
        int element=q.peek()[1];
        q.poll();
        while(!q.isEmpty()&&q.peek()[0]==min&&q.peek()[1]>element){
            element=q.peek()[1];
            q.poll();
        }
       return element;
    }
}
