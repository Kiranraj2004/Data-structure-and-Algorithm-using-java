package Array;

public class jump_game {
    public static void main(String[] args) {
        int[]nums={2,5,0,0,0};
        System.out.println(canJump(nums));
    }
    public  static boolean canJump(int[] nums) {
     int i=0;
     while (i<nums.length-1){
         if (nums[i]==0){
             return false;
         }
         i+=nums[i];

     }
     return true;
    }
}
