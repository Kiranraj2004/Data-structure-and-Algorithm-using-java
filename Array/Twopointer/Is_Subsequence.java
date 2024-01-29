package Array.Twopointer;

public class Is_Subsequence {
    public static void main(String[] args) {
        String s="";
        String t="ahbfc";
        System.out.println(isSubsequence(s,t));
    } public static boolean isSubsequence(String s, String t) {
      int i=0,j=0;
     while(i<s.length()&&j<t.length()){
         if (s.charAt(i)==t.charAt(j)){
             i++;
         }
         j++;
     }
    return i==s.length();
    }

}
