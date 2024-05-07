package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;
import java.util.*;
public class Combination_Sum {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(combinationSum(arr,4));

    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>object=new ArrayList<>();
        helper(candidates,target,0,res,object);
        return res;
    }

    private static void helper(int[] arr, int target, int i, List<List<Integer>> res, ArrayList<Integer> objects) {
        if (i==arr.length){
            if (target==0){
                res.add(new ArrayList<>(objects));
            }
            return;
        }
        if (target>=arr[i]){
            objects.add(arr[i]);
            helper(arr,target-arr[i],i,res,objects);
            objects.remove(objects.size()-1);
        }
        helper(arr,target,i+1,res,objects);
    }
}
