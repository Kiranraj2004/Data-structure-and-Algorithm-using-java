package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;
import java.util.*;
public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        String s="";
        System.out.println(letterCombinations(s));
    }
    public static List<String> letterCombinations(String digits) {
        StringBuffer s=new StringBuffer();
        List<String>res=new ArrayList<>();
        if (digits.length()==0){
            return res;
        }
        String[]temp={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(0,digits,s,res,temp);
        return res;

    }

    private static void helper(int i,String digits, StringBuffer s, List<String> res, String[] temp) {
        if (i==digits.length()){
            res.add(s.toString());
            return;
        }
        int k=(int)digits.charAt(i)-50;
        for (int j = 0; j <temp[k].length() ; j++) {
            s.append(temp[k].charAt(j));
            helper(i+1,digits,s,res,temp);
            s.deleteCharAt(s.length()-1);
        }

    }
}
