package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;
import java.util.*;
public class Permutations_II {
    public static void main(String[] args) {
        int[]arr={2,2,1,1};
        System.out.println(permuteUnique(arr));
    }
    public static  List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        helper(nums,0,res);
        return res;
    }
    private static void helper(int[] nums, int start, List<List<Integer>> res) {
        if (start==nums.length){
            ArrayList<Integer>s=new ArrayList<>();
            for(int i:nums){
                s.add(i);
            }
            if (!res.contains(s))
                res.add(s);
            return;
        }
        for (int i = start; i <nums.length ; i++) {
            if (i!=start&&nums[start]==nums[i]){
                continue;
            }
            swap(nums,start,i);
            helper(nums,start+1,res);
            swap(nums,start,i);
        }

    }

    private static void swap(int[] nums, int j, int i) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
