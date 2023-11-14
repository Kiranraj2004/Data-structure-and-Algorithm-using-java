package String;
//https://leetcode.com/problems/find-the-difference
public class Find_the_Difference {
    public static void main(String[] args) {
 String s="a";
 String t="ah";
        System.out.println(findTheDifference(s,t));
    }
    public  static char findTheDifference(String s, String t) {
        int S=0,T=0;
        for (int i = 0; i <s.length() ; i++) {
            S+=(int)(s.charAt(i));

        }
        for (int k = 0; k <t.length() ; k++) {
            T+=(int)(t.charAt(k));
        }
        return (char)(T-S);
    }
}
