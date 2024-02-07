package binary_search;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[]nums={1,1,2,2,3,3,4,4,5,5,6};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while (start<end){
            mid=start+(end-start)/2;
            if (mid%2==1){
                mid--;
            }
             if(nums[mid]!=nums[mid+1]){
                end=mid;
            }else{
                start=mid+2;
            }
        }
     return nums[start];
    }
}
