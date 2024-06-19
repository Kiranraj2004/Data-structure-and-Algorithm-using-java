package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;
import java.util.*;
public class Cycle_Detection_in_undirected_Graph_dfs {
    public static void main(String[] args) {

    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[V];
        for (int i = 0; i <V ; i++) {
            if(!visited[i]){
               boolean temp= helper(adj,i,i,visited);
               if (temp)return true;
            }
        }
        return false;
    }

    private boolean helper(ArrayList<ArrayList<Integer>> adj, int i, int parent, boolean[] visited) {
        visited[i]=true;
        for (Integer t:adj.get(i)) {
            if (t==parent)continue;
            if (visited[t])return true;
            if(helper(adj,t,i,visited))return true;
        }
        return false;
    }
}
