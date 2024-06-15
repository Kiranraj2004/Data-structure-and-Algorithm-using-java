package A2Z_Strivers_DSA.recursion;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(subsets(arr));

    }

    public  static List<List<Integer>> subsets(int[] nums) {
        List<Integer>res=new ArrayList<>();
        List<List<Integer>>a=new ArrayList<>();
        sub(nums,0,res,a );
        return a;

    }
    public static void sub(int[]arr,int index,List<Integer> res ,List<List<Integer>>a){
        if(index>=arr.length){
            List<Integer> copy = new ArrayList<>(res);
            a.add(copy);
            return;
        }
        res.add(arr[index]);

        sub(arr,index+1,res ,a);
        res.remove(res.size()-1);
        sub(arr,index+1,res,a);
    }
//    The time and space complexity of generating all subsets of an array of size `n` using recursion is as follows:
//
//            1. Time Complexity:
//            - The time complexity is \(O(2^n)\), where \(n\) is the length of the input array.
//   - This is because for each element in the array, there are two choices: either include it in the subset or exclude it. Since there are \(n\) elements in the array, the total number of subsets generated is \(2^n\).
//
//            2. Space Complexity:
//            - The space complexity is also \(O(2^n)\) because there can be \(2^n\) subsets in the output.
//            - Additionally, there's space required for the recursion stack, which can go up to the depth of the recursion tree, i.e., \(O(n)\) in the worst case.
//
//    So, the overall time and space complexity of generating all subsets using recursion is \(O(2^n)\).
}
