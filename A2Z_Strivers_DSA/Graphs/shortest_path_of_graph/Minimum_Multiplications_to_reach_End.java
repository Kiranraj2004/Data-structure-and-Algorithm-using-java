package A2Z_Strivers_DSA.Graphs.shortest_path_of_graph;

import java.util.*;
public class Minimum_Multiplications_to_reach_End {
    public static void main(String[] args) {
        int []a={3, 4, 65};
        System.out.println(minimumMultiplications(a,7,8787));
    }
    static class pair{
        int node;
        int step;

        public pair(int node,int step) {
            this.node = node;
            this.step=step;
        }
    }


     static int   minimumMultiplications(int[] arr, int start, int end) {
        Queue<pair>q=new LinkedList<>();
        int[]temp=new int[100000];
        Arrays.fill(temp,(int)1e9);
        q.add(new pair(start,0));
        temp[start]=0;
        int mod=100000;
        while(!q.isEmpty()){
           int node=q.peek().node;
           int step=q.peek().step;
           q.remove();
            for (int j : arr) {
              int n1=(node*j)%mod;
              if (temp[n1]>step+1){
                  temp[n1]=step+1;
                  if (n1==end)return step+1;
                  q.add(new pair(n1,step+1));
              }
            }
        }
        return -1;
    }
}
