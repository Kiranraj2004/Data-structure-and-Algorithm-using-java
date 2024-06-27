package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_path_in_Directed_Acyclic_Graph {
    public static void main(String[] args) {

    }
    public int[] shortestPath(int N,int M, int[][] edges) {
        int []distance=new int[N];
        Arrays.fill(distance,-1);
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for (int i = 0; i <N ; i++) {
            adj.add(new ArrayList<int[]>());
        }
        for (int i = 0; i <M ; i++) {
            int s=edges[i][0];
            int d=edges[i][1];
            int w=edges[i][2];
            adj.get(s).add(new int[]{d,w});
        }
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        distance[0]=0;
        while(!q.isEmpty()){
            int s=q.remove();
            int sd=distance[s];
            for(int[] i:adj.get(s)){
                int d=i[0];
                int w=i[1];
                if (distance[d]==-1){
                    distance[d]=sd+w;
                    q.add(d);
                }
                else{
                    if (distance[d]>sd+w){
                        distance[d]=sd+w;
                        q.add(d);
                    }
                }
            }
        }
       return distance;
    }
}
