package binary_search;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[]nums={5,1,3};
        System.out.println(search(nums,5));
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        if (start== nums.length-1){
            start=0;
        }
         int left=binary_search(nums,0,start,target);
         int right=binary_search(nums,start+1,nums.length-1,target );
        if (left!=-1)return left;
        return right;
    }
    private static int binary_search(int[]nums,int start,int end,int target){
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
