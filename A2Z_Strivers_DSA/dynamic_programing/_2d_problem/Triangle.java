package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        List<int[]>dp=new ArrayList<>();
        for (int i = 1; i <=triangle.size() ; i++) {
            int []r=new int[i];
            Arrays.fill(r,Integer.MAX_VALUE);
            dp.add(r);
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < triangle.size() ; i++) {
            min=Math.min(min,helper(triangle,dp,triangle.size()-1,i));
        }
        return min;
    }

    private int helper(List<List<Integer>> t, List<int[]> dp, int row, int col) {
        if(row==0)return t.get(0).get(0);
        if(dp.get(row)[col]!=Integer.MAX_VALUE)return dp.get(row)[col];
        int min=Integer.MAX_VALUE;
//        same index
        if(col<=row-1){
            min=Math.min(min,helper(t,dp,row-1,col));
        }

//        col-1 coloumn
        if(col-1>=0){
            min=Math.min(min,helper(t,dp,row-1,col-1));
        }
        min+=t.get(row).get(col);
       return dp.get(row)[col]=min;
    }

}
