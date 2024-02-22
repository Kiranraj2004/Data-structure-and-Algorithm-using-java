package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        Stack<Integer> res=new Stack<>();
        for (int i = nums.length-1; i >=0; i--) {
            int num = nums[i];
            while (!res.isEmpty() && num > res.peek()) {
                res.pop();
            }
            if (res.isEmpty()) {
                temp.put(num, -1);
            } else {
                temp.put(num, res.peek());
            }
            res.push(num);
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=temp.get(nums[i]);
        }
        return nums;
    }
}
