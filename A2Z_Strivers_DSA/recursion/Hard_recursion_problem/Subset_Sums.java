package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.ArrayList;

public class Subset_Sums {
    public static void main(String[] args) {
        ArrayList<Integer>res=new ArrayList<>();
        res.add(2);
        res.add(3);
        System.out.println(subsetSums(res,res.size()));

    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
       ArrayList<Integer>res=new ArrayList<>();
       helper(arr,0,res,0);
       return res;
    }

    private static void helper(ArrayList<Integer> arr, int index, ArrayList<Integer> res,int sum) {
        if (index==arr.size()){
            res.add(sum);
            return;
        }
        sum+=arr.get(index);
        helper(arr,index+1,res,sum);
        sum-=arr.get(index);
        helper(arr,index+1,res,sum);
    }
}
