package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public interface Next_Greater_Element_I {
    public static void main(String[] args) {
        int[]arr={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,2,1},arr)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        Stack<Integer>r=new Stack<>();

        for (int i = nums2.length-1; i>=0; i--) {
            while (!r.isEmpty()&&nums2[i]>r.peek()){
                r.pop();
            }
            if (r.isEmpty()){
                r.push(nums2[i]);
                temp.put(nums2[i],-1);
            }
            else{
                temp.put(nums2[i],r.peek());
                r.push(nums2[i]);
            }
        }
        for (int i = 0; i <nums1.length ; i++) {
            nums1[i]=temp.get(nums1[i]);
        }
      return nums1;
    }
}
