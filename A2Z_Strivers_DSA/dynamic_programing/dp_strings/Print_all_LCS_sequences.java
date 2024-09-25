package A2Z_Strivers_DSA.dynamic_programing.dp_strings;
import  java.util.*;
public class Print_all_LCS_sequences {
    public static void main(String[] args) {
        String s = "abaaa", t = "baabaca";
        Print_all_LCS_sequences obj=new Print_all_LCS_sequences();
        System.out.println(obj.all_longest_common_subsequences(s,t));

    }
    public List<String> all_longest_common_subsequences(String s, String t) {
        int n=s.length(),m=t.length();
        int [][]dp=new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                int same = 0;
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    same = 1 + dp[i - 1][j - 1];
                }
                int notsame = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.max(same, notsame);
            }
        }
        System.out.println( dp[n][m]);
        for(int[]row:dp){
            System.out.println(Arrays.toString(row));
        }

        return new ArrayList<>();



    }
}
