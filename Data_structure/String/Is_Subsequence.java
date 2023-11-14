package String;
//https://leetcode.com/problems/is-subsequence
public class Is_Subsequence {
    public static void main(String[] args) {
        String s ="aa";
        String t="baab";
        System.out.println(isSubsequence(s,t));
    }
    public  static boolean isSubsequence(String s, String t) {
       int a=0,g=0;
        for (int i = 0; i <s.length() ; i++) {
            boolean answer=false;
            for (int j = a; j <t.length() ; j++) {
                if (s.charAt(i)==t.charAt(j)){
                    answer=true;
                    g++;
                    a=j+1;
                    break;
                }
            }
            if (!answer)return false;
        }
        return g==s.length();
    }
}
