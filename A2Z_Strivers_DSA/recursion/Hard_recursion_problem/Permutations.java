package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int []nums={1,3,2};
        System.out.println(permute(nums));
    }

    //    time complexity O(N!*N) space complexityO(3N)stack space and temp variable and to store every time you are going to use arrayList
//    public  static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>>res=new ArrayList<>();
//        boolean []temp=new boolean[nums.length];
//        helper(nums,temp,res,new ArrayList<Integer>());
//        return res;
//    }

//    private static void helper(int[] nums, boolean[] temp, List<List<Integer>> res, ArrayList<Integer> i) {
//        if (i.size()==nums.length){
//            if (!res.contains(new ArrayList<>(i)))
//                   res.add(new ArrayList<>(i));
//            return;
//        }
//        for (int j = 0; j <nums.length ; j++) {
//            if (temp[j]==false){
//                i.add(nums[j]);
//                temp[j]=true;
//                helper(nums,temp,res,i);
//                i.remove(i.size()-1);
//                temp[j]=false;
//            }
//        }
//    }


//    time complexity O(N!*N) space complexityO(N)stack space
    public  static List<List<Integer>> permute(int[] nums) {
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
            res.add(s);
            return;
        }
        for (int i = start; i <nums.length ; i++) {
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
