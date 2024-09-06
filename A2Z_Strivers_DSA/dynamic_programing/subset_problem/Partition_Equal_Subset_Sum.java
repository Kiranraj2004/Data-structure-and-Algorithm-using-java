package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

public class Partition_Equal_Subset_Sum {
    public static void main(String[] args) {
        Partition_Equal_Subset_Sum obj =new Partition_Equal_Subset_Sum();
        int []arr={5,1,11,5};
        System.out.println(obj.canPartition(arr));
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }

        int target=sum/2;
        int [][]dp=new int [nums.length][target+1];
        return helper(nums,target,0,dp);
    }

    private boolean helper(int[] nums, int target, int index,int [][]dp) {
        if(target==0){
            return true;
        }
        if(index>=nums.length){
            return false;
        }
//        1 is for true 2 is false
        if(dp[index][target]!=0){
            return dp[index][target]==1;
        }
        boolean nottake=helper(nums,target,index+1,dp);
        boolean take=false;
        if(nums[index]<=target){
            take=helper(nums,target-nums[index],index+1,dp);
        }
        dp[index][target]=(take||nottake)?1:2;
        return take||nottake ;
    }
}
