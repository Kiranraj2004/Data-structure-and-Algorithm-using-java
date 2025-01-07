package binary_search;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[]nums={3,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start=0;
        int end= nums.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];

    }
}
