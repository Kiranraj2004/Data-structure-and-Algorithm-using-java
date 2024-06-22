package A2Z_Strivers_DSA.Graphs.Topological_sorting;
import java.util.*;
public class topo {
    public static void main(String[] args) {

    }
    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
      boolean []visited=new boolean[V];
      Stack<Integer>temp=new Stack<>();
        for (int i = 0; i <V ; i++) {
            if (!visited[i]){
                dfs(adj,visited,i,temp);
            }
        }
        int []res=new int[V];
        for (int i = 0; i <res.length ; i++) {
            res[i]=temp.pop();
        }
        return res;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i, Stack<Integer> temp) {
        visited[i]=true;
        for(Integer a:adj.get(i)){
            if (!visited[a]){
                dfs(adj,visited,a,temp);
            }
        }
        temp.add(i);
    }
}
