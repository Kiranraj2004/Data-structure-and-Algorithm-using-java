package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }
    //    brute force method linear search
    public int findmin(int []nums){
        int min=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }


//     optimal force method  my method
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]<=nums[mid]&&nums[mid]>nums[end]){
                min=Math.min(min,nums[mid]);
                start=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                end=mid-1;
            }

        }
        return min;
    }


//     stivers method
    public int findMin1(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                ans = Math.min(ans, arr[low]);

                // Eliminate left half:
                low = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
                ans = Math.min(ans, arr[mid]);

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return ans;

    }
}
