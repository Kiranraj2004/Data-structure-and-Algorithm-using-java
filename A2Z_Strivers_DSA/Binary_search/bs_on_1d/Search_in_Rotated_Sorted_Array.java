package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array obj=new Search_in_Rotated_Sorted_Array();
        int []a={4,5,0,1,2};
        System.out.println(obj.search(a,2));

    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=e-(e-s)/2;
            if(nums[mid]==target)return mid;
//            right array sorted
            else if(nums[s]<nums[mid]){
//                checking whether it lies in between that range
                if(nums[s]<=target&&nums[mid]>=target){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }

            }
//            left sorted
            else{
                if(nums[mid]<=target&&nums[e]>=target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }

            }
        }
        return -1;
    }
}
