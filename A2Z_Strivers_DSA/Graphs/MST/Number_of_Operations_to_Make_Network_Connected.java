package A2Z_Strivers_DSA.Graphs.MST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Number_of_Operations_to_Make_Network_Connected {
    public static void main(String[] args) {

    }

//     this is using dfs
//    public int makeConnected(int n, int[][] connections) {
//        if (connections.length<n-1){
//            return -1;
//        }
//        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
//        for (int i = 0; i <n ; i++) {
//            adj.add(new ArrayList<>());
//        }
//        for (int i = 0; i < connections.length; i++) {
//            int u=connections[i][0];
//            int v=connections[i][2];
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//        }
//        boolean []visited=new boolean[n];
//        int count=0;
//        for (int i = 0; i <n ; i++) {
//            if (!visited[i]){
//                count++;
//                helper(adj,visited,i);
//            }
//        }
//        return count-1;
//    }
//
//    private void helper(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i) {
//        visited[i]=true;
//        for(int x:adj.get(i)){
//            if (!visited[i]){
//                helper(adj,visited,x);
//            }
//        }
//    }

    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)return -1;
        int []rank=new int[n];
        int []parent=new int[n];
        for (int i = 0; i <n ; i++) {
            rank[i]=0;
            parent[i]=i;
        }
        for (int i = 0; i <connections.length ; i++) {
            int u=connections[i][0];
            int v=connections[i][1];
            if(findparent(u,parent)!=findparent(v,parent)){
                union(u,v,rank,parent);
            }
        }
        HashSet<Integer>temp=new HashSet<>();
        for (int i = 0; i <parent.length ; i++) {
            temp.add(findparent(parent[i],parent));
        }
        return temp.size()-1;
    }

    private void union(int u, int v, int[] rank,int[]parent) {
        int pu=findparent(u,parent);
        int pv=findparent(v,parent);
        if(pu==pv)return;
        if (rank[pu]>rank[pv]){
            parent[pv]=pu;
        }
        else if (rank[pu]<rank[pv]){
            parent[pu]=pv;
        }
        else{
            parent[pv]=pu;
            rank[pu]++;
        }
    }

    private int findparent(int u, int[] parent) {
        if(parent[u]!=u){
            parent[u]=findparent(parent[u],parent);
        }
        return parent[u];
    }
}
