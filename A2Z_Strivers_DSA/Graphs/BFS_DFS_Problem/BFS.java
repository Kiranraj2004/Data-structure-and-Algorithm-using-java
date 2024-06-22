package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
      boolean[]visited=new boolean[V];
        visited[0]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        ArrayList<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.remove();
            res.add(node);
            for(Integer i: adj.get(node)){
                if (!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return res;

    }
}
