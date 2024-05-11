package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Subsets_II {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        helper(nums,0,res,new ArrayList<>());
        return res;

    }

//    time complexity O(2**k *n*NlogN)
//    space complexity O(n*n)

//    private static void helper(int[] nums, int i, List<List<Integer>> res, ArrayList<Integer> o) {
//        if (i==nums.length){
//            ArrayList<Integer>s=new ArrayList<>(o);
//            Collections.sort(s);
//            if (!res.contains(s)){
//                res.add(s);
//            }
//            return;
//        }
//        o.add(nums[i]);
//        helper(nums,i+1,res,o);
//        o.remove(o.size()-1);
//        helper(nums,i+1,res,o);
//    }

    private static void helper(int[] nums, int i, List<List<Integer>> res, ArrayList<Integer> o) {
        res.add(new ArrayList<>(o));
        for (int j = i; j <nums.length ; j++) {
            if (j>i&&nums[j]==nums[j-1])continue;
            o.add(nums[i]);
            helper(nums,j+1,res,o);
            o.remove(o.size()-1);
        }
    }
}
