package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

import java.util.*;

public class printing_the_target_sum_in_subsequence {
    public static void main(String[] args) {
        int []arr={1,2,1};

        subsequencetarget(arr,0,2,0,new ArrayList<>());
    }
    public static void subsequencetarget(int[]arr,int i,int target,int sum,List<Integer>sub){
        if (i==arr.length){
            if (sum==target){
                System.out.println(sub);
            }
            return;
        }
        sum+=arr[i];
        sub.add(arr[i]);
        subsequencetarget(arr,i+1,target,sum,sub);
        sum-=arr[i];
        sub.remove(sub.size()-1);
        subsequencetarget(arr,i+1,target,sum,sub);
    }
}
