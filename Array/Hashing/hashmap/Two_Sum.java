package Array.Hashing.hashmap;
// this question i have done previously but at that time i have one in o(n2) now o(n)
import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int []nums={7,2};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
    public  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (temp.containsKey(target-nums[i])){
                return new int[] {temp.get(target-nums[i]),i};
            }else{
                temp.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
