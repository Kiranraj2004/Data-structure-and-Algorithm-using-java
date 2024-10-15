package A2Z_Strivers_DSA.Array.Easy;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array obj=new Remove_Duplicates_from_Sorted_Array();
        int []nums={1,1,2};
        System.out.println(Arrays.toString(nums));
        obj.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));

    }

//     brute force method
    public int removeDuplicates(int[] nums) {
        int index=1;
        int []ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                ans[index++]=nums[i];
            }
        }
        for(int i=1;i<index;i++){
            nums[i]=ans[i];
        }
        return index;
    }
//    tc-O(2n) sc-O(n)

//    optimal solution
    public int removeDuplicates1(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index-1;
    }
    //    tc-O(n) sc-O(1)
}
