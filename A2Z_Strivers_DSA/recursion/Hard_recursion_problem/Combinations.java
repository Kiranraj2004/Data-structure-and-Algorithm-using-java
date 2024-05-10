package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4,2));

    }
    public static  List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        helper(n,k,1,res,new ArrayList<>());
        return res;
    }

    private static void helper(int n, int k, int i, List<List<Integer>> res, ArrayList<Integer> a) {
        if (a.size()==k){
            res.add(new ArrayList<>(a));
            return;
        }
        if (i<=n) {
            a.add(i);
            helper(n, k, i + 1, res, a);
            a.remove(a.size() - 1);
            helper(n, k, i + 1, res, a);
        }
    }
}
