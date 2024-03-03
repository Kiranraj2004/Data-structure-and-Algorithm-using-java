package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {
        String exp="ab+cd-*";
        System.out.println(postfixToPrefix(exp));
    }
    public static String postfixToPrefix(String exp) {
        // Write your code here
        Stack<String>res=new Stack<>();
        String s="+-/*";
        for (int i = 0; i <exp.length() ; i++) {
            if (s.indexOf(exp.charAt(i))==-1){
                res.push(String.valueOf(exp.charAt(i)));
            }else{
                String first=res.pop();
                String second=res.pop();
                StringBuffer r=new StringBuffer();
                r.append(exp.charAt(i));
                r.append(second);
                r.append(first);
                res.push(r.toString());
            }
        }
        return res.pop();
    }
}
