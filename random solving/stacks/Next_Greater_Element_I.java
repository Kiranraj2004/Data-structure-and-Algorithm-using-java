package stacks;

import java.util.Arrays;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[]nums1={2,4};
        int []nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public  static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []res=new int[nums1.length];
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
             if (nums1[i]==nums2[j]){
                 if (j+1!=nums2.length&&nums2[j]<nums2[j+1]){
                     res[i]=nums2[j+1];
                 }
                 else{
                     res[i]=-1;
                 }
             }
            }

        }
        return res;

    }
}
