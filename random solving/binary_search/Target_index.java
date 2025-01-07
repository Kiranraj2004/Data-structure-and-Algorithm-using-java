//https://leetcode.com/problems/find-target-indices-after-sorting-array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Target_index {
    public static void main(String[] args) {
        int[]nums={1,2,5,2,3};
        int target=2;
        System.out.println(get_index(nums,target));
    }
    static List<Integer>get_index(int[]nums, int target){
        Arrays.sort(nums);
List <Integer>result=new ArrayList<>();
        for (int i = 0; i <= nums.length-1 ; i++) {
            if (nums[i]==target) result.add(i) ;
            }
        return result;
        }
}
