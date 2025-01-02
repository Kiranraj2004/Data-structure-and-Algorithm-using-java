package A2Z_Strivers_DSA.Binary_search.bs_on_ans;

import java.util.ArrayList;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start=nums[0];
        int end=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int partition=get_partition(nums,mid);
            if(partition>k){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static  int get_partition(int[]arr, int mid){
        int partition=1;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(sum+arr[i]>mid){
                partition++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return partition;
    }
}
