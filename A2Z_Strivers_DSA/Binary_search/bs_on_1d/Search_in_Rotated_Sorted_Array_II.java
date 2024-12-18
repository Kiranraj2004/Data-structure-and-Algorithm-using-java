package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {

    }
//     brute force method
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)return true;
        }
        return false;
    }
//    TC O(n) sc O(1)



//     optimal solution  using binary search

    public boolean search1(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (nums[mid]==target)return true;

            if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                start++;
                end--;
            }
            else if(nums[start]<=nums[mid]){
                if (nums[start]<=target&&nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (nums[mid]<target&&nums[end]>=target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }

//    tc o(log n)
//    sc o(1)
}
