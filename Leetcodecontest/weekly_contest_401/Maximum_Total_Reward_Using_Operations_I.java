package Leetcodecontest.weekly_contest_401;

import java.util.Arrays;

public class Maximum_Total_Reward_Using_Operations_I {
    public static void main(String[] args) {
        int []arr={1,1,3,3};
        System.out.println(maxTotalReward(arr));

    }
    public static  int maxTotalReward(int[] rewardValues) {
        int []max={0};
        Arrays.sort(rewardValues);
        helper(rewardValues,0,0,max);
        return max[0];
    }

    private static void helper(int[] arr, int i, int sum, int[] max) {
        if (i==arr.length){
            max[0]=Math.max(max[0],sum);
            return;
        }
        if (arr[i]>sum){
            helper(arr,i+1,sum+arr[i],max);
        }
        helper(arr,i+1,sum,max);
    }
}
