package A2Z_Strivers_DSA.Graphs.Topological_sorting;
import java.util.*;
public class Directed_Graph_Cycle {
    public static void main(String[] args) {

    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[]frequence=new int[V];
        Queue<Integer>temp=new LinkedList<>();
        for (int i = 0; i <adj.size() ; i++) {
            for(Integer j:adj.get(i)){
                frequence[j]++;
            }
        }
        for (int i = 0; i < frequence.length ; i++) {
            if (frequence[i]==0){
                temp.add(i);
            }
        }
       int res=0;
        while (!temp.isEmpty()) {
            int a = temp.remove();
           res++;
            for (Integer s : adj.get(a)) {
                frequence[s]--;
                if (frequence[s] == 0) {
                    temp.add(s);
                }
            }
        }
        if (res==V)return false;
        return true;
    }
}
