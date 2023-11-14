package binary_search;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class First_lastindex {
    public static void main(String[] args) {
        int []arr={2,2,2,2,2,2,2,2,2};
        int target=2;
        System.out.println(Arrays.toString(searchindex(arr,target)));

    }
    public static int[]searchindex(int[]nums,int target){
       int[]answer={-1,-1};
        int start=0;
        int end=nums.length-1;
        if (nums[0]==nums[nums.length-1]){
            return new int[]{0,nums.length-1};
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
             answer[0]=index(nums,target,mid,true);
                answer[1]=index(nums,target,mid,false);
                break;
            }
            if (nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
    }
        return answer;

}
    public static int index(int[]nums,int target,int mid,boolean startindex){
    int start=0,end=nums.length-1;
    int h=mid;
        if (startindex==true){
            end=mid-1;
    }
        else start=mid+1;
        while(start<=end){
            mid=start+(end-start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid]>target)end=mid-1;
            else start=mid+1;
        }

        return h;

    }
}
