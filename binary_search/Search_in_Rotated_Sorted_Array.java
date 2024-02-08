package binary_search;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[]nums={1,0,1,1,1};
        System.out.println(search(nums,0));
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int mid;
     while (start<=end){
         mid=start+(end-start)/2;
         if (nums[mid]==target)return mid;
         else if(nums[start]<=nums[mid]){
             if (nums[start]<=target&&nums[mid]>target){
                 end=mid-1;
             }
             else{
                 start=mid+1;
             }
         }
         else{
             if (nums[mid]<target&&nums[end]>=target){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }
         }
     }
     return -1;
    }

}
