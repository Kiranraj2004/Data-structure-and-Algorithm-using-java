package A2Z_Strivers_DSA.heaps.medium_question;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;

public class Merge_k_Sorted_Arrays {
    public static void main(String[] args) {
        int [][]arr={{3,2,1},
                {7,6,5},{0,9,8}};
        System.out.println(mergeKArrays(arr,arr.length));

    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K)
    {
        ArrayList<Integer>res=new ArrayList<>();
        for (int i = 0; i <K ; i++) {
            for (int j = 0; j <K ; j++) {
                res.add(arr[i][j]);
            }
        }
        for (int i = res.size()/2-1; i >=0 ; i--) {
            hefipy(res,i,res.size()-1);
        }
        int n=res.size()-1;
        while(n>0){
           int temp= res.get(0);
           res.set(0,res.get(n));
           res.set(n,temp);
            hefipy(res,0,n-1);
           n--;
        }
        return res;
    }

    private static void hefipy(ArrayList<Integer> res, int i, int n) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if (left<=n&&res.get(left)>res.get(largest)){
            largest=left;
        }
        if (right<=n&&res.get(right)>res.get(largest)){
            largest=right;
        }
        if (largest!=i){
            int temp= res.get(i);
            res.set(i,res.get(largest));
            res.set(largest,temp);
            hefipy(res,largest,n);
        }
    }
}
