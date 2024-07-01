package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


public class Number_of_Ways_to_Arrive_at_Destination {
    public static void main(String[] args) {
        int[][]a={{0,6,7},{0,1,2},{1,2,3},{1,3,3},
                {6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
        System.out.println(countPaths(7,a));
    }
     static private class add{
        int node;
        int distance;
        add(int node,int di){
            this.node=node;
            distance=di;
        }
    }
    static private class add1{
        int node;
        int distance;
        int parent;
        add1(int node,int di ,int p){
            this.node=node;
            distance=di;
            parent=p;
        }
    }
    public static int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<add>>adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.length ; i++) {
            int u=roads[i][0];
            int v=roads[i][1];
            int time=roads[i][2];
            adj.get(u).add(new add(v,time));
            adj.get(v).add(new add(u,time));
        }
        int count=0;
        PriorityQueue<add1>q=new PriorityQueue<>((x,y)->x.distance-y.distance);
        q.add(new add1(0,0,0));
        int[]time=new int[n];
        Arrays.fill(time,(int)1e9);
        while(!q.isEmpty()){
            int node=q.peek().node;
            int t=q.peek().distance;
            int parent= q.peek().parent;
            q.poll();
            for(add a:adj.get(node)){
                int node1=a.node;
                int t1=a.distance;
                if (node1==parent)continue;
                if (time[node1]>t+t1){
                    time[node1]=t+t1;
                    if (node1==n-1){
                        count=1;
                        continue;
                    }
                    q.add(new add1(node1,t1+t,node));
                }
               else if (node1==n-1&&time[node1]==t+t1){
                    count= (int) ((int) (count+1)%(Math.pow(10,9)+7));
                }
            }
        }
        return count;
    }
}
