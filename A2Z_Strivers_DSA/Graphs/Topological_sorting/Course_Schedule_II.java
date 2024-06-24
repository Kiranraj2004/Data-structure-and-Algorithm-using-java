package A2Z_Strivers_DSA.Graphs.Topological_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Course_Schedule_II {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOrder(2,new int[][]{{1,0}})));
    }
    public static int[] findOrder(int n, int[][] p) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <p.length ; i++) {
            adj.get(p[i][1]).add(p[i][0]);
        }
        int[]indegree=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i <adj.size() ; i++) {
            for(Integer j:adj.get(i)){
                indegree[j]++;
            }
        }
        for (int i = 0; i <indegree.length ; i++) {
            if (indegree[i]==0){
                q.add(i);
            }
        }
        int[]res=new int[n];
        int i=0;
        while (!q.isEmpty()){
            int a=q.remove();
            res[i++]=a;
            for(Integer j:adj.get(a)){
                indegree[j]--;
                if (indegree[j]==0){
                    q.add(j);
                }
            }
        }

        if (i==n)return res;
        return new int[]{};
    }
}
