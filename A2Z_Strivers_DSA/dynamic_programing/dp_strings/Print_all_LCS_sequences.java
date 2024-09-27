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
         int ans=dp[n][m];
        List<String>res=new ArrayList<>();
        StringBuffer a=new StringBuffer();
        for (int i = 0; i <ans ; i++) {
            a.append('$');
        }
        int i=n,j=m;
        int index=ans-1;
        helper(s,t,dp,a,index,i,j,res);
//
//        while(i>0&j>0){
//            if(s.charAt(i-1)==t.charAt(j-1)){
//                a.setCharAt(index,s.charAt(i-1));
//                index--;
//                i--;
//                j--;
//            }
//            else if(s.charAt(i-1)>t.charAt(j-1)){
//                i--;
//            }
//            else{
//                j--;
//            }
//        }
//        System.out.println(a);
        return res;
    }

    private void helper(String s, String t, int[][] dp, StringBuffer a, int index, int i, int j,List<String>res) {
        if(i<=0||j<=0) {
            if (index == -1&&!res.contains(a.toString())) {
                res.add(a.toString());
            }
            return;
        }
            if(s.charAt(i-1)==t.charAt(j-1)){
                a.setCharAt(index,s.charAt(i-1));
               helper(s,t,dp,a,index-1,i-1,j-1,res);
            }
            else  {
                if(dp[i][j-1]>=dp[i-1][j]){
                    helper(s,t,dp,a,index,i,j-1,res);
               }
                if(dp[i-1][j]>=dp[i][j-1]){
                    helper(s,t,dp,a,index,i-1,j,res);
                }
           }
    }
}
