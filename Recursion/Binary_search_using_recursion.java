package Recursion;

public class Binary_search_using_recursion {
    public static void main(String[] args) {
      int []n={1,2,3,4,58,99};
      int target=99;
        System.out.println(binarysearch(n,target,0,n.length-1));
    }
    static int binarysearch(int[]nums,int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
       if (nums[mid]==target){
           return mid;
       }
       else if (nums[mid]<target) {
           return binarysearch(nums,target,mid+1,end);
       }
      return binarysearch(nums,target,start,mid-1);
    }
}
