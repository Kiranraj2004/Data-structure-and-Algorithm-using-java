package A2Z_Strivers_DSA.recursion;

import java.util.*;
import java.util.Arrays;

public class a_1_to_N_Without_Loop {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(1)));
        System.out.println(printNtimes(4));
    }
// brute force method;
//    static int[]res;
//    public static void intalization(int a){
//        res=new int[a];
//    }
//    public static int[] printNos(int x) {
//       intalization(x);
//       return helper(x);
//    }
//    public static int[]helper(int x){
//        if (x==0){
//            return res;
//        }
//        res[x-1]=x;
//        return helper(x-1);
//    }
public static int[] printNos(int x) {
    // Write Your Code Here
    int []arr=new int[x];
    helper(x,arr);
    return arr;

}
    public static void helper(int x,int[]arr){
        if (x==0){
            return;
        }
        arr[x-1]=x;
        helper(x-1,arr);
    }
     static List<String>res=new ArrayList<>();
    public static List<String> printNtimes(int n){
        // Write your code here.
        if(n==0){
            return res;
        }
        res.add("Coding Ninjas ");
        return printNtimes(n-1);
   }


}
