package Array;
import java.util.*;
//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions
public class convert_an_Array_to_2d {
    public static void main(String[] args) {
        int []nums={1,3,4};
        System.out.println(findMatrix(nums));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        for (int a:nums
             ) {
            temp.add(a);
        }
      int count =0;
        while (count!=nums.length){
            List<Integer>in=new ArrayList<>();
            for (int i = 0; i < temp.size() ; ) {
                if (!in.contains(temp.get(i))){
                    in.add(temp.get(i));
                    count++;
                    temp.remove(i);
                }
                else{
                    i++;
                }

            }
            res.add(in);
        }
        return res;
    }
}
