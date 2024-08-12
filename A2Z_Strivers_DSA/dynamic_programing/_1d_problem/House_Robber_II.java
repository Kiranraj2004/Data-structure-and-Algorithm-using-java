package A2Z_Strivers_DSA.dynamic_programing._1d_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class House_Robber_II {
    public static void main(String[] args) {
        House_Robber_II obj=new House_Robber_II();
        int []arr={10,3};
        System.out.println(obj.rob(arr));

    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        ArrayList<Integer>includeone=new ArrayList<>();
        ArrayList<Integer>excludeone=new ArrayList<>();

        for (int i = 0; i <nums.length ; i++) {
            if(i!=0){
                excludeone.add((nums[i]));
            }
            if(i!=nums.length-1){
                includeone.add(nums[i]);

            }
        }
        int  includeans=solve(includeone);
        int  excludeans=solve(excludeone);
        return Math.max(includeans,excludeans);
    }

  public int solve(ArrayList<Integer>nums){
        int prev=nums.get(0);
        int prev2=0;
      for (int i = 1; i <nums.size() ; i++) {
          int pick=nums.get(i);
          if(i>1){
              pick+=prev2;
          }
          int notpick=prev;
          int current=Math.max(pick,notpick);
          prev2=prev;
          prev=current;
      }
      return prev;
  }
  public int slove1(ArrayList<Integer>nums){
        int []dp=new int[nums.size()];
        Arrays.fill(dp,-1);
        dp[0]=nums.get(0);
      for (int i = 1; i <nums.size() ; i++) {
          int pick=nums.get(i);
          if(i>1)pick+=dp[i-2];
          int notpick=dp[i-1];
          int current=Math.max(pick,notpick);
          dp[i]=current;
      }
      return dp[nums.size()-1];
  }
}
