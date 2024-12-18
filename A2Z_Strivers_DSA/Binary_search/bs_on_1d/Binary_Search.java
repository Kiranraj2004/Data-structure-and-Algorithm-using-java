package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Binary_Search {
    public static void main(String[] args) {
        int []arr={1,2,4,5,6};
        System.out.println(search1(arr,6));
        
    }
//    iterative  method
    public static  int search(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int mid=e-(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target)e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
//    TC O(logn) sc(1)

//    recursive method
    public  static int search1(int[] nums, int target) {
         return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int[]nums,int target,int s,int e){
        if(s>e)return -1;
        int mid=e-(e-s)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target) return helper(nums,target,s,mid-1);
        return helper(nums,target,mid+1,e);
    }
}
