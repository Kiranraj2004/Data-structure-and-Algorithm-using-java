package geeksforgeeks.Array;

public class Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
        int[]nums={2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }
    public  static boolean increasingTriplet(int[] nums) {
        for (int i = 0; i <nums.length-2 ; i++) {
            if (nums[i]< nums[i+1]&&nums[i+1]<nums[i+2]){
                return true;
            }
        }
        return false;
    }
}
