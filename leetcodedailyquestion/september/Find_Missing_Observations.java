package leetcodedailyquestion.september;

import java.util.Arrays;

public class Find_Missing_Observations {
    public static void main(String[] args) {
        int []arr={3,2,4,3};
        Find_Missing_Observations obj=new Find_Missing_Observations();
        System.out.println(Arrays.toString(obj.missingRolls(arr,4,2)));
    }
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum=0;
        for (int i:rolls){
            sum+=i;
        }
        int target=(mean*(n+m));
        target=target-sum;
        int []result=new int[n];
        if(target>6*n||target<n)return new int[0];
       int distributemean=target/n;
       int mod=target%n;
        Arrays.fill(result, distributemean);
        for(int i=0;i<mod;i++)result[i]++;
        return result;
    }
//we cant use the backtracking method it gives TLE
    private boolean helper(int[] result, int i, int target) {
        if(i>=result.length){
            return target == 0;
        }
        for (int j = 1; j <=6 ; j++) {
//            take
            if(j<=target){
                result[i]=j;
               if( helper(result,i+1,target-j)){
                   return true;
               }
            }
        }
        return false;
    }
}
