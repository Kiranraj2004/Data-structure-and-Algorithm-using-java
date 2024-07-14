package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;
import java.util.*;
public class Bellman_Ford_Algorithm {
    public static void main(String[] args) {

    }
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {

        int []distance=new int[V];
        Arrays.fill(distance,(int)1e8);
        distance[S]=0;
        int i=0;
        while(i<V-1){
            for(ArrayList<Integer>adj:edges){
                int u=adj.get(0);
                int v=adj.get(1);
                int weight=adj.get(2);
                if(distance[u]!=1e8&&distance[u]+weight<distance[v]){
                    distance[v]=distance[u]+weight;
                }
            }
            i++;
        }
        for(ArrayList<Integer>adj:edges){
            int u=adj.get(0);
            int v=adj.get(1);
            int weight=adj.get(2);
            if(distance[u]+weight<distance[v]){
                return new int[]{-1};
            }
        }
        return distance;
    }
}
