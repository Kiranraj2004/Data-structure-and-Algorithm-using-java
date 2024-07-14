package Leetcodecontest.weeklycontest_406;
import java.util.*;
public class Lexicographically_Smallest_String_After_a_Swap {
    public static void main(String[] args) {
        System.out.println(getSmallestString("13"));

    }
    public static String getSmallestString(String s) {
        StringBuffer res=new StringBuffer(s);
        for(int i=1;i<s.length();i++){
            if(res.charAt(i)==res.charAt(i-1)){
                continue;
            }
            if(isevenorodd(res.charAt(i),res.charAt(i-1))){
                char temp=res.charAt(i);
                res.setCharAt(i,res.charAt(i-1));
                res.setCharAt(i-1,temp);
            }
        }

        return res.toString();
    }
    public static boolean isevenorodd(char i,char i1){
        int a=(int)i-48;
        int b=(int)i1-48;
        if (a%2==b%2&&a<b){
            return true;
        }
        return false;

    }
}
