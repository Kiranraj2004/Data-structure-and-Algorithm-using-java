package A2Z_Strivers_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class printing_only_once_subsequence_equal_to_target {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        subsequencetarget(arr,0,2,0,new ArrayList<>());

    }
//    if we want to avoid the further recursion this will be helpful
    public static boolean subsequencetarget(int[]arr, int i, int target, int sum, List<Integer> sub){
        if (i==arr.length){
            if (sum==target){
                System.out.println(sub);
                return true;
            }
            return false;
        }
        sum+=arr[i];
        sub.add(arr[i]);
       if(subsequencetarget(arr, i + 1, target, sum, sub)){
           return true;
       }
        sum-=arr[i];
        sub.remove(sub.size()-1);
        if(subsequencetarget(arr, i + 1, target, sum, sub)){
            return true;
        }
    return false;
    }
}
