package A2Z_Strivers_DSA.Graphs.Topological_sorting;
import java.util.*;
public class Kahn_s_Algorithm {
    public static void main(String[] args) {
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int []res=new int[V];
        int[]frequence=new int[V];
        Queue<Integer>temp=new LinkedList<>();
        for (int i = 0; i <adj.size() ; i++) {
           for(Integer j:adj.get(i)){
               frequence[j]++;
           }
        }
        for(int i:frequence){
            if (i==0){
                temp.add(i);
            }
        }
        int i=0;
        while (!temp.isEmpty()){
            int a=temp.remove();
            res[i]=a;
            for(Integer s:adj.get(a)){
                frequence[s]--;
                if (frequence[s]==0){
                    temp.add(s);
                }
            }
            i++;
        }
        return res;

    }


}
