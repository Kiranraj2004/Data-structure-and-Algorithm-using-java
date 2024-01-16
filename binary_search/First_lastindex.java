package binary_search;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class First_lastindex {
    public static void main(String[] args) {
        int []arr={2,2};
        int target=2;
        System.out.println(Arrays.toString(searchindex(arr,target)));

    }
//   brute force method
//    public static int[]searchindex(int[]nums,int target){
//     int last=-1,first=-1;
//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i]==target){
//                if (first==-1){
//                    first=i;
//                }
//                last=i;
//            }
//        }
//        return new int[]{first,last};
//}
public static int[]searchindex(int[]nums,int target)
{ int first=-1,last=-1,mid;
    int start=0;
    int end=nums.length-1;
    while (start<=end){
        mid=start+(end-start)/2;
        if (nums[mid]==target){
            if (mid==0||nums[mid-1]!=target){
                first=mid;
                break;
            }
            else{
                end=mid-1;
            }
        } else if (nums[mid]>target) {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    start=0;
     end=nums.length-1;
    while (start<=end){
        mid=start+(end-start)/2;
        if (nums[mid]==target){
            if (mid==nums.length-1||nums[mid+1]!=target){
                last=mid;
                break;
            }
            else{
                start=mid+1;
            }
        } else if (nums[mid]>target) {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
       return new int[]{first,last};
}
//public static int[] searchindex(int[] nums, int target) {
//    int first = findFirst(nums, target);
//    int last = findLast(nums, target);
//    return new int[]{first, last};
//}
//
//    private  static int findFirst(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        int first = -1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                if (mid == 0 || nums[mid - 1] != target) {
//                    first = mid;
//                    break;
//                } else {
//                    right = mid - 1;
//                }
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return first;
//    }
//
//    private  static int findLast(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        int last = -1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                if (mid == nums.length - 1 || nums[mid + 1] != target) {
//                    last = mid;
//                    break;
//                } else {
//                    left = mid + 1;
//                }
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return last;
//    }
}
