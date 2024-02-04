package binary_search;

//https://leetcode.com/problems/binary-search/
public class Binary_search {
 public static void main(String[] args) {
        int []nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(binarysearch(nums,target));
    }
    public static int binarysearch(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;
    }
}
