package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;
import java.util.*;
public class Combination_Sum_II {
    public static void main(String[] args) {
       int [] candidates = {1,2,2,2,5};
       int target = 5;
        System.out.println(combinationSum2(candidates,target));
    }
    public static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>object=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,res,object);
        return res;
    }
    private static void helper(int[] arr, int target, int i, List<List<Integer>> res, ArrayList<Integer> object) {
        if (target==0){
            ArrayList<Integer>a=new ArrayList<>(object);
            if (!res.contains(a))
               res.add(a);
            return;
        }
        if (i==arr.length)return;
        int temp=arr[i];
        if (target>=arr[i]){
            object.add(arr[i]);
            helper(arr,target-arr[i],i+1,res,object);
            object.remove(object.size()-1);
        }
//        skipping the duplicate if we have ex 1,2,2,2 i=1 we can skip the next two elements
        int s=1;
        while (i+s<arr.length&&arr[i+s]==temp){
            s++;
        }
        helper(arr,target,i+s,res,object);
    }
}
