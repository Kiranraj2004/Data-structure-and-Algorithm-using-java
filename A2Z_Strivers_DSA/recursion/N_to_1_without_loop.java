package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class N_to_1_without_loop {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(5)));
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int []arr=new int[x];
        helper(x,arr,0);
        return arr;
    }
    public static void helper(int x,int[]arr,int i){
        if (x==0){
            return;
        }
        arr[i]=x;
        helper(x-1,arr,i+1);
    }
}
