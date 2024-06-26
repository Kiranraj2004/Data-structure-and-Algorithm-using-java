package A2Z_Strivers_DSA.Graphs.Topological_sorting;

import java.util.*;

public class Find_Eventual_Safe_States {
    public static void main(String[] args) {
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>res=new ArrayList<>();
        ArrayList<ArrayList<Integer>>temp=new ArrayList<>();
        for (int i = 0; i <graph.length ; i++) {
            temp.add(new ArrayList<>());
        }
        for (int i = 0; i <graph.length ; i++) {
            for (int j = 0; j <graph[i].length ; j++) {
                temp.get(graph[i][j]).add(i);
            }
        }
        int []outdeegre=new int[graph.length];
        for(ArrayList<Integer>a:temp){
            for (Integer j:a){
                outdeegre[j]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i <outdeegre.length ; i++) {
            if (outdeegre[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int i=q.remove();
            res.add(i);
            for(Integer j:temp.get(i)){
                outdeegre[j]--;
                if (outdeegre[j]==0)q.add(j);
            }
        }
        Collections.sort(res);
        return res;

    }}
