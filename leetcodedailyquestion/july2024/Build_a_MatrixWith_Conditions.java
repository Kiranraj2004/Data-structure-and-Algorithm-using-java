package leetcodedailyquestion.july2024;
import java.util.*;
public class Build_a_MatrixWith_Conditions {
    public static void main(String[] args) {
        int col[][] = {{2, 1}, {3, 2}};
        int [][]row={{1,2},{3,2}};
        int [][]res=buildMatrix(3,row,col);
        for(int i[]:res){
            System.out.println(Arrays.toString(i));
        }

    }
    public static int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int [][]res=new int[k][k];
        int []rowindeegre=new int[k];
        List<List<Integer>>rowadj=new ArrayList<>();
        List<List<Integer>>coladj=new ArrayList<>();
        int []colindeegre=new int[k];
        for (int i = 0; i <k ; i++) {
            rowadj.add(new ArrayList<>());
            coladj.add(new ArrayList<>());
        }
        for (int i = 0; i <rowConditions.length ; i++) {
            int u=rowConditions[i][0]-1;
            int v=rowConditions[i][1]-1;
            rowadj.get(u).add(v);
            rowindeegre[v]+=1;
        }
        List<Integer>rowres=helper(rowadj,rowindeegre);
        if (rowres.size()!=k)return new int[][]{};

        for (int i = 0; i <colConditions.length ; i++) {
            int u=colConditions[i][0]-1;
            int v=colConditions[i][1]-1;
            coladj.get(u).add(v);
            colindeegre[v]+=1;
        }
        List<Integer>colres=helper(coladj,colindeegre);
        if (colres.size()!=k)return new int[][]{};
        for (int i = 0; i <rowres.size() ; i++) {
            int j=colres.indexOf(rowres.get(i));
            int val=rowres.get(i)+1;
            res[i][j]=val;
        }
        return res;

    }

    private static  List<Integer> helper(List<List<Integer>> adj, int[] indeegre) {
        List<Integer>res=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i <indeegre.length ; i++) {
            if (indeegre[i]==0){
                q.add(i);
            }
        }
        if (q.isEmpty())return res;
        while (!q.isEmpty()){
            int val=q.remove();
            res.add(val);
            for (int i:adj.get(val)){
                indeegre[i]--;
                if (indeegre[i]==0){
                    q.add(i);
                }
            }
        }
        return res;
    }
}
