package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;
import java.util.*;
public class Implementing_Dijkstra_Algorithm {
    public static void main(String[] args) {

    }
//    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
//    {
//        // Write your code here
//        int []distance=new int[V];
//        Arrays.fill(distance,-1);
//        Queue<Integer>q=new LinkedList<>();
//        q.add(S);
//        distance[S]=0;
//        while(!q.isEmpty()){
//            int s=q.remove();
//            int sd=distance[s];
//            for(ArrayList<Integer> i:adj.get(s)){
//
//                    int d = i.get(0);
//                    int w = i.get(1);
//                    if (distance[d] == -1) {
//                        distance[d] = sd + w;
//                        q.add(d);
//                    } else {
//                        if (distance[d] > sd + w) {
//                            distance[d] = sd + w;
//                            q.add(d);
//                        }
//                    }
//                }
//            }
//        return distance;
//    }

    class pair{
        int distance;
        int node;
        pair(int d,int n){
            this.distance=d;
            node=n;
        }
    }
 int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
{
    // Write your code here
    int []distance=new int[V];
    PriorityQueue<pair>q=new PriorityQueue<>((x,y) -> x.distance - y.distance);
    Arrays.fill(distance, (int) 1e9);
    distance[S]=0;
    q.add(new pair(0,S));
    while(!q.isEmpty()){
        int d=q.peek().distance;
        int node=q.peek().node;
        q.poll();
        for(ArrayList<Integer>i:adj.get(node)){
            int edgeWeight = i.get(1);
            int adjNode = i.get(0);
            if(d + edgeWeight < distance[adjNode]) {
                distance[adjNode] = d + edgeWeight;
                q.add(new pair(distance[adjNode], adjNode));
            }

        }
    }

    return distance;
}

}
