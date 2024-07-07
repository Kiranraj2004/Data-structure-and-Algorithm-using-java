package Leetcodecontest.weekly_contest_405;
import java.util.*;
public class Generate_Binary_Strings_Without_Adjacent_Zeros {
    public static void main(String[] args) {
        System.out.println(validStrings(4));


    }
    public static List<String> validStrings(int n) {
        List<String>res=new ArrayList<>();
        if (n==1){
            res.add("0");
            res.add("1");
            return res;
        }

        helper(res,n,  (int)Math.ceil((double)n / 2), new StringBuffer());

        return res;
    }

    private static void helper(List<String> res, int n, int maxzero,StringBuffer x) {
        if (x.length()==n){
            res.add(x.toString());
            return;
        }
        if (maxzero>0){
            if (!(x.length()>0&&x.charAt(x.length()-1)=='0')){
                x.append('0');
                helper(res,n,maxzero-1,x);
                x.deleteCharAt(x.length()-1);
            }
        }
        x.append('1');
        helper(res,n,maxzero,x);
        x.deleteCharAt(x.length()-1);
    }
}
