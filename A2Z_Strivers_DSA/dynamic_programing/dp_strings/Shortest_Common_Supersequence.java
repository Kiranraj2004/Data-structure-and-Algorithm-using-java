package A2Z_Strivers_DSA.dynamic_programing.dp_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shortest_Common_Supersequence {
    public static void main(String[] args) {
        Shortest_Common_Supersequence obj=new Shortest_Common_Supersequence();
        System.out.println(obj.shortestCommonSupersequence("abac","cab"));
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        int [][]dp=new int[str1.length()+1][str2.length()+1];
        for (int i=1;i<=str1.length();i++){
            for (int j = 1; j <=str2.length() ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        for(int []row:dp){
            System.out.println(Arrays.toString(row));
        }
        int anslength=dp[n][m];
        StringBuffer a=new StringBuffer();
        for (int i = 0; i <anslength ; i++) {
            a.append('$');
        }
        int i=n,j=m;
        int index=anslength-1;
//
        while(i>0&&j>0&&index>=0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                a.setCharAt(index,str1.charAt(i-1));
                index--;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.println(a);

        StringBuffer res=new StringBuffer();
        i=0;
        j=0;
        int k=0;
        while(k<a.length()){
            while(str1.charAt(i)!=a.charAt(k)){
                res.append(str1.charAt(i));
                i++;
            }
            while(str2.charAt(j)!=a.charAt(k)){
                res.append(str2.charAt(j));
                j++;
            }
            res.append(str2.charAt(j));
            i++;
            j++;
            k++;
        }
        res.append(str1, i, n);
        res.append(str2, j, m);
        return res.toString();
    }
}
