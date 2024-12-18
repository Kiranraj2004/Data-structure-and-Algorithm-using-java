package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []ans=new int[2];
        ans[0]=leftindex(nums,target,n);
        ans[1]=rightindex(nums,target,n);
        return ans;
    }
    public int leftindex(int []nums,int target,int n){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=e-(e-s)/2;
            if(nums[mid]==target){
                if(mid-1>=0&&nums[mid-1]==target)e=mid-1;
                else return mid;
            }
            else if(nums[mid]>target)e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    public int rightindex(int []nums,int target,int n){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=e-(e-s)/2;
            if(nums[mid]==target){
                if(mid+1<n&&nums[mid+1]==target)s=mid+1;
                else return mid;
            }
            else if(nums[mid]>target)e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
