package A2Z_Strivers_DSA.Graphs.Topological_sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Course_Schedule {
    public static void main(String[] args) {
        System.out.println(canFinish(3,new int[][]{{1,0},{2,1}}));

    }
    public static  boolean canFinish(int numCourses, int[][] prerequisites) {
      HashMap<Integer,ArrayList<Integer>>temp=new HashMap<>();
        for (int i = 0; i <prerequisites.length ; i++) {
            if (temp.containsKey(prerequisites[i][0])){
                ArrayList<Integer>a=temp.get(prerequisites[i][0]);
                a.add(prerequisites[i][1]);
                temp.put(prerequisites[i][0],a);
            }
            else{
                ArrayList<Integer>a=new ArrayList<>();
                a.add(prerequisites[i][1]);
                temp.put(prerequisites[i][0],a);
            }
        }
        int[]indegree=new int[numCourses];
        Queue<Integer>q=new LinkedList<>();
        for (Integer i:temp.keySet()) {
            for(Integer j:temp.get(i)){
                indegree[j]++;
            }
        }
        for (int i = 0; i < indegree.length ; i++) {
            if (indegree[i]==0){
                q.add(i);
            }
        }
        int res=0;
        while (!q.isEmpty()) {
            int a = q.remove();
            res++;
            if (!temp.containsKey(a))continue;
            for (Integer s : temp.get(a)) {
                indegree[s]--;
                if (indegree[s] == 0) {
                    q.add(s);
                }
            }
        }
        return res == numCourses;
    }
}
