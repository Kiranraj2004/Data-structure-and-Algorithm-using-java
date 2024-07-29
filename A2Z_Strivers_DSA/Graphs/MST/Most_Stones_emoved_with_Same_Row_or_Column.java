package A2Z_Strivers_DSA.Graphs.MST;

import java.util.HashSet;

public class Most_Stones_emoved_with_Same_Row_or_Column {
    public static void main(String[] args) {

    }
      static class unionbysize{
        int []size;
        int []parent;
        unionbysize(int n){
            size=new int[n+1];
            parent=new int[n+1];
            for (int i = 0; i <=n ; i++) {
                parent[i]=i;
                size[i]=1;
            }
        }
        public int  findparent(int u){
            if(parent[u]==u){
                return u;
            }
            return parent[u]=findparent(parent[u]);
        }
        public void unsion_size(int u,int v){
            int pu=findparent(u);
            int pv=findparent(v);
            if (pu==pv)return;
            if (size[pu]<size[pv]){
                parent[pu]=pv;
                size[pv]=size[pv]+size[pu   ];
            }
            else {
                parent[pv]=pu;
                size[pu]=size[pu]+size[pv];
            }
        }
      }
    public int removeStones(int[][] stones) {
        int maxrow=0;
        int maxcol=0;
        for (int i = 0; i <stones.length ; i++) {
            maxrow=Math.max(maxrow,stones[i][0]);
            maxcol=Math.max(maxcol,stones[i][1]);
        }
        unionbysize obj=new unionbysize(maxrow+maxcol+1);
        HashSet<Integer>temp=new HashSet<>();
        for (int i = 0; i < stones.length; i++) {
            int nodeRow = stones[i][0];
            int nodeCol = stones[i][1] + maxrow + 1;
            obj.unsion_size(nodeRow, nodeCol);
            temp.add(nodeRow);
            temp.add((nodeCol));
        }
        int count=0;

       for(int i:temp){
           if(obj.findparent(i)==i){
               count++;
           }
       }
        return stones.length-count;

    }
}
