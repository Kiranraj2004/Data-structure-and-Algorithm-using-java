package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Shortest_path_in_Undirected_Graph {
    public static void main(String[] args) {

    }
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        int []distance=new int[n];
        Arrays.fill(distance,-1);
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <m ; i++) {
           int j= edges[i][0];
           int k=edges[i][1];
           if (j==k)continue;
           adj.get(j).add(k);
           adj.get(k).add(j);
        }
        Queue<Integer>q=new LinkedList<>();
        distance[src]=0;
        q.add(src);
        while(!q.isEmpty()){
            int e=q.remove();
            int dist=distance[e];
            for(Integer i:adj.get(e)){
                if (distance[i]==-1){
                    distance[i]=dist+1;
                    q.add(i);
                }
                else{
                    if (distance[i]>dist+1){
                        distance[i]=dist+1;
                        q.add(i);
                    }
                }
            }
        }
        return distance;
    }
}
