package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static void main(String[] args) {
        int[]nums={5,1,1,1,1};
        System.out.println(Arrays.toString(bruteforcemethod(nums)));
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
      int []arr=new int[nums.length];
      Arrays.fill(arr,-1);
        Stack<Integer> res=new Stack<>();
        for (int i = nums.length*2-1; i >=0; i--) {
            int index=i%nums.length;
            while (!res.isEmpty() && nums[index] >= res.peek()) {
                res.pop();
            }
           if (!res.isEmpty()){
               arr[index]=res.peek();
           }
           res.push(nums[index]);
        }

        return arr;
    }

    public  static int[]bruteforcemethod(int []nums){
        int[]res=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            boolean temp=false;
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j]>nums[i]){
                    res[i]=nums[j];
                    temp=true;
                    break;
                }
            }
            for (int j = 0; j <i&& !temp; j++) {
                if (nums[j]>nums[i]){
                    res[i]=nums[j];
                    temp=true;
                    break;
                }
            }
            if (!temp){
                res[i]=-1;
            }
        }
        return res;
    }
}
