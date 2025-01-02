package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Find_Peak_Element {
    public static void main(String[] args) {

    }

//     brute force method
    public int findPeakElement(int[] nums) {
        for(int current=1;current<nums.length;current++){
            if(nums[current-1]>nums[current]){
                return current-1;
            }
        }
        return nums.length-1;
    }
//     tc O(n) sc O(1)
}
