package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Number_of_occurrence {
    public static void main(String[] args) {
        int []arr={1, 1, 2, 2, 2, 2, 3};
        System.out.println(countFreq(arr,3));
    }
    static int countFreq(int[] arr, int target) {
        int n=arr.length;
        return rightindex(arr,target,n)-leftindex(arr,target,n)+1;
    }
   static  public int leftindex(int []nums,int target,int n){
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
        return 1;
    }
     static public int rightindex(int []nums,int target,int n){
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
        return 0;
    }

}
