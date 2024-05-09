package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int []nums={1,3,2};
        System.out.println(permute(nums));
    }
    public  static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        boolean []temp=new boolean[nums.length];
        helper(nums,temp,res,new ArrayList<Integer>());
        return res;
    }

    private static void helper(int[] nums, boolean[] temp, List<List<Integer>> res, ArrayList<Integer> i) {
        if (i.size()==nums.length){
            if (!res.contains(new ArrayList<>(i)))
                   res.add(new ArrayList<>(i));
            return;
        }
        for (int j = 0; j <nums.length ; j++) {
            if (temp[j]==false){
                i.add(nums[j]);
                temp[j]=true;
                helper(nums,temp,res,i);
                i.remove(i.size()-1);
                temp[j]=false;
            }
        }
    }
//public static List<List<Integer>> permute(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    permutea(nums, 0, result);
//    return result;
//}
//
//  public static   void permutea(int[] nums, int start, List<List<Integer>> result) {
//        if (start == nums.length-1) {
//            ArrayList<Integer> integerList = new ArrayList<>();
//            for (int value : nums) {
//                integerList.add(value);
//            }
//            result.add(integerList);
//        } else {
//            for (int i = start; i < nums.length; i++) {
//                swap(nums, start, i);
//                permutea(nums, start+1, result);
//                swap(nums, start, i);
//            }
//        }
//    }
//
//    public static void swap(int[] nums, int i, int j) {
//        int tmp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = tmp;
//    }
}
