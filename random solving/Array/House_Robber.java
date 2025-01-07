package array;

public class House_Robber {
    public static void main(String[] args) {
        int[]nums={2,1,1,2};
        System.out.println(rob(nums));

    }
    public static int rob(int[] nums) {
       int answer=0;
       int notrob=0;
        for (int i = 0; i <nums.length ; i+=2) {
            answer+=nums[i];
            if (i+1<nums.length){
                notrob+=nums[i+1];
            }
        }
        return Math.max(answer,notrob);
    }
}
