package A2Z_Strivers_DSA.dynamic_programing.dp_strings;
import java.util.*;
public class Longest_Common_Subsequence {
    public static void main(String[] args) {

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp=new int[text1.length()][text2.length()];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return helper(text1,text2,text1.length()-1,text2.length()-1,dp);

    }
    public int helper(String text1, String text2,int index1,int index2,int[][]dp){
        if(index1<0||index2<0){
            return 0;
        }
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2)){
            return 1+helper(text1,text2,index1-1,index2-1,dp);
        }

        return dp[index1][index2]=Math.max(helper(text1,text2,index1-1,index2,dp),helper(text1,text2,index1,index2-1,dp));
    }
    public int longestCommonSubsequence1(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int [][]dp=new int[n+1][m+1];
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                int same = 0;
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    same = 1 + dp[i - 1][j - 1];
                }
                int notsame = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.max(same, notsame);
            }
        }
        return dp[n][m];
    }
}
