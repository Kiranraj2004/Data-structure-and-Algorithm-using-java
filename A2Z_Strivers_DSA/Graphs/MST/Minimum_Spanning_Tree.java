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
       boolean []visited=new boolean[V];
       PriorityQueue<pair>q=new PriorityQueue<>((x,y)->x.dist-y.dist);
       q.add(new pair(0,0));
       int sum=0;
       while(!q.isEmpty()){
           int node=q.peek().node;
           int dist=q.peek().dist;
           q.poll();
           if (visited[node])continue;
           visited[node]=true;
           sum+=dist;
           for(int i[]:adj.get(node)){
               int n=i[0];
               int w=i[1];
               if (!visited[n]){
                   q.add(new pair(n,w));
               }
           }
       }
       return sum;
    }
}
