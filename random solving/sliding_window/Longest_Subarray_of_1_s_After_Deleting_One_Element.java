package sliding_window;

public class Longest_Subarray_of_1_s_After_Deleting_One_Element {
    public static void main(String[] args) {
int []nums={1,1,1,0};
        System.out.println(longestSubarray(nums));
    }
    public  static int longestSubarray(int[] nums) {
        int start,end,k,max;
        start=end=max=k=0;
        while (end<nums.length){
            if (nums[end]==0){
                k++;
            }
            while (start<end&&k>1){
                if (nums[start]==0){
                    k--;
                }
                start++;
            }
            max=Math.max(max,end-start);
            end++;
        }

       return max;
    }
}
