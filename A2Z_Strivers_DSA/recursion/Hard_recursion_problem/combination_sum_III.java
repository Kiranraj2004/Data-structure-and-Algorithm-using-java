package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class combination_sum_III {
    public static void main(String[] args) {
        System.out.println(combinationSum3(2,18));
    }
    public  static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        if (k>n)return res;
        helper(1,k,n,res,new ArrayList<>());

        return res;

    }

    private static void helper(int i, int k, int n, List<List<Integer>> res, ArrayList<Integer> o) {
        if (k==0){
            if (n==0){
                List<Integer>a=new ArrayList<>(o);
                res.add(a);
            }
            return;
        }
        if (i>9||i>n){
            return;
        }
        o.add(i);
        helper(i+1,k-1,n-i,res,o);
        o.remove(o.size()-1);
        helper(i+1,k,n,res,o);
    }
}
