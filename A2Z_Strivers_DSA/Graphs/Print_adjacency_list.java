package A2Z_Strivers_DSA.Graphs;

import java.util.*;

public class Print_adjacency_list {
    public static void main(String[] args) {

    }
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>>res=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length ; i++) {
            int node=edges[i][0];
            int conectedto=edges[i][1];
            res.get(node).add(conectedto);
            res.get(conectedto).add(node);
        }
        return res;

    }
}
