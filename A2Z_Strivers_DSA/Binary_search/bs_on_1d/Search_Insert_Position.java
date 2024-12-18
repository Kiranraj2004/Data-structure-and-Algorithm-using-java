package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int []arr={1,3,4,5,6};
        System.out.println(searchInsert(arr,7));

    }
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=e-(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
//        if(s==nums.length)return nums.length-1;
        return s;
    }
}
