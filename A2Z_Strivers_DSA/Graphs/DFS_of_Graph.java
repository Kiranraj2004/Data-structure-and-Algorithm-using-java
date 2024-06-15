package A2Z_Strivers_DSA.Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class DFS_of_Graph {
    public static void main(String[] args) {

    }
//    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//        // Code here
//        ArrayList<Integer>res=new ArrayList<>();
//        boolean[] visited=new boolean[V];
//        Stack<Integer>s=new Stack<>();
//        s.add(0);
//        while (!s.isEmpty()){
//            int node=s.pop();
//            if(visited[node]){
//                continue;
//            }
//            visited[node]=true;
//            res.add(node);
//            for (int i=adj.get(node).size()-1;i>=0;i--){
//                if (!visited[adj.get(node).get(i)]){
//                    s.push(adj.get(node).get(i));
//                }
//            }
//        }
//        return res;
//    }

//    using recursion
//    sc O(N)+O(N)+O(N)
//    TC O(N)+(2*V)
public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    // Code here
    ArrayList<Integer>res=new ArrayList<>();
    boolean[] visited=new boolean[V];
        helper(adj,res,visited,0);
        return res;
}

    private void helper(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] visited, int node) {
        res.add(node);
        visited[node]=true;
        for(Integer i:adj.get(node)){
            if (!visited[i]){
                helper(adj,res,visited,i);
            }
        }
    }
}
