package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;
import java.util.*;
public class generate_paranthasis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));

    }
    public  static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0,  new StringBuffer(),n);
        return res;
    }

    public static  void recurse(List<String> res, int left, int right, StringBuffer s, int n) {
        if (s.length() == n * 2) {
            res.add(s.toString());
            return;
        }

        if (left < n) {
            s.append('(');
            recurse(res, left + 1, right, s , n);
            s.deleteCharAt(s.length()-1);
        }

        if (right < left) {
            s.append(')');
            recurse(res, left, right + 1, s , n);
            s.deleteCharAt(s.length()-1);
        }
    }
}
