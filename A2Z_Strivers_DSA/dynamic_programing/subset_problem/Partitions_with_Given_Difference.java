package A2Z_Strivers_DSA.dynamic_programing.subset_problem;

public class Partitions_with_Given_Difference {
    public static void main(String[] args) {
        Partition_Equal_Subset_Sum obj=new Partition_Equal_Subset_Sum();
        int []arr={0 ,1, 2, 2, 2, 3, 0, 3 ,0, 1};
        System.out.println(countPartitions(arr.length,12,arr));
    }
    public static int countPartitions(int n, int d, int[] arr) {
        int sum=0;
        for(int i:arr)sum+=i;
        int [][]dp=new int [n][sum+1];
        for (int i = 0; i <n ; i++) {
            dp[i][0]=1;
        }
        if(arr[0]<=sum){
            dp[0][arr[0]]=1;
        }
        for (int index = 1; index <n ; index++) {
            for (int target = 1; target <=sum ; target++) {
                int nottake=dp[index-1][target];
                int take=0;
                if(arr[index]<=target){
                    take=dp[index-1][target-arr[index]];
                }
                dp[index][target] = (take + nottake) % ((int) Math.pow(10, 9) + 7);

            }
        }
        int s1=sum/2;
        s1+=sum%2;
        int count=0;
        for (int i = s1; i <=sum ; i++) {
            int s2=sum-i;
            if(dp[n-1][i]>0&&i-s2==d){
                count+=dp[n-1][i];
            }
        }
        return count;
    }
}
