package A2Z_Strivers_DSA.Graphs.MST;
import java.util.*;
public class Minimum_Spanning_Tree {
    public static void main(String[] args) {
        int V = 3;
        int E = 3;
        List<List<int[]>> adj = new ArrayList<>();
        adj.add(Arrays.asList(new int[]{1, 5}, new int[]{2, 1}));
        adj.add(Arrays.asList(new int[]{0, 5}, new int[]{2, 3}));
        adj.add(Arrays.asList(new int[]{0, 1}, new int[]{1, 3}));

        System.out.println(spanningTree(V, E, adj));

    }
     static class  pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
     }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int[] distance=new int[V];
        Arrays.fill(distance, (int) 1e8);
        distance[0]=0;
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int element=q.poll();
            for (int []i:adj.get(element)) {
                int v=i[0];
                int dist=i[1];
                if (distance[v]>dist){
                    distance[v]=dist;
                    q.add(v);
                }
            }
        }
        int sum=0;

        for (int i = 0; i < distance.length ; i++) {
            sum+=distance[i];
        }
        return sum;
    }
}
