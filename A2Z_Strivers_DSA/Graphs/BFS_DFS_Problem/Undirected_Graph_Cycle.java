package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;
import java.util.*;
public class Undirected_Graph_Cycle {
    public static void main(String[] args) {

    }

//    Time Complexity: O(N + 2E) + O(N),
//Space Complexity: O(N) + O(N) ~ O(N)
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<int[]>temp=new LinkedList<>();
        boolean[]visited=new boolean[V];
        for (int i = 0; i <V ; i++) {
            if (!visited[i]){
                visited[i]=true;
                temp.add(new int[]{i,i});
                while(!temp.isEmpty()){
                    int[]a=temp.remove();
                    for(Integer adjlist:adj.get(a[0])){
                        if (adjlist==a[1])continue;
                        if (visited[adjlist])return true;
                        else{
                            visited[adjlist]=true;
                            temp.add(new int[]{adjlist,a[0]});
                        }
                    }
                }
            }

        }
        return false;

    }
}
