package A2Z_Strivers_DSA.dynamic_programing._2d_problem;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {

    }

//    memoization  top bottom approach
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


//    tabulation bottom up approach
        public int minimumTotal1(List<List<Integer>> t) {
            List<int[]>dp=new ArrayList<>();
            for (int i = 1; i <=t.size() ; i++) {
                int []r=new int[i];
                dp.add(r);
            }
            dp.get(0)[0]=t.get(0).get(0);
            for(int i=1;i<t.size();i++){
                for(int j=0;j<dp.get(i).length;j++){
                    int min=Integer.MAX_VALUE;
                    //  i th index consideration
                    if(j<i){
                        min=Math.min(min,dp.get(i-1)[j]);
                    }
                    // i-1 th index
                    if(j-1>=0){
                        min=Math.min(min,dp.get(i-1)[j-1]);
                    }
                    min+=t.get(i).get(j);
                    dp.get(i)[j]=min;

                }
            }
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < t.size() ; i++) {
                min=Math.min(min,dp.get(t.size()-1)[i]);
            }
                    return min;
        }

//        space optimization at max it will take O(n) space
    public int minimumTotal2(List<List<Integer>> triangle) {
        int []prev=new int [1];
        int n=triangle.size();
        prev[0]=triangle.get(0).get(0);
        for (int i = 1; i <n ; i++) {
            int[]current=new int[i+1];
            for (int j = 0; j <i+1 ; j++) {
                int min=Integer.MAX_VALUE;
                //  i th index consideration
                if(j<i){
                    min=Math.min(min,prev[j]);
                }
                // i-1 th index
                if(j-1>=0){
                    min=Math.min(min,prev[j-1]);
                }
                min+=triangle.get(i).get(j);
                current[j]=min;
            }
            prev=current;
            }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n ; i++) {
            min=Math.min(min,prev[i]);
        }
        return min;

        }

}
