package A2Z_Strivers_DSA.recursion;
import java.util.*;
public class printing_only_how_many_subsequence_equal_to_target {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        System.out.println(subsequencetarget(arr,0,2,0,new ArrayList<>()));
    }
    public static int subsequencetarget(int[]arr,int i,int target,int sum,List<Integer>sub){
        if (i==arr.length){
            if (sum==target){
                return 1;
            }
            return 0;
        }
        sum+=arr[i];
        sub.add(arr[i]);
      int left=  subsequencetarget(arr,i+1,target,sum,sub);
        sum-=arr[i];
        sub.remove(sub.size()-1);
        int right=subsequencetarget(arr,i+1,target,sum,sub);
        return left+right;
    }
}
