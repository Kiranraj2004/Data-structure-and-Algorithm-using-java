package A2Z_Strivers_DSA.recursion;
import java.util.*;

public class Print_Subsequences {
    public static void main(String[] args) {
        String a="ab";
        System.out.println(generateSubsequences(a));
    }

//     static List<String>res=new ArrayList<>();
    public static List<String> generateSubsequences(String s) {
        // Write your code here
        StringBuffer a=new StringBuffer();
         List<String>res=new ArrayList<>();
        helper(0,s,a ,res);
        return res;
    }
    public static void helper(int i,String s,StringBuffer a ,  List<String>res){
        if (i==s.length()){
           res.add( a.toString());
           return;
        }
        a.append(s.charAt(i));
        helper(i+1,s,a,res);
        a.deleteCharAt(a.length()-1);
        helper(i+1,s,a,res);
    }
}
