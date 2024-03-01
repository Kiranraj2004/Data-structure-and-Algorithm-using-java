package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class Postfix_to_Infix {
    public static void main(String[] args) {
        String postfix="ABC/DA-*+";
        System.out.println(postToInfix(postfix));

    }
    public static String postToInfix(String postfix) {
        // Write your code here.
        Stack<String>arr=new Stack<>();
        for (int i = 0; i <postfix.length() ; i++) {
            if (postfix.charAt(i)=='+'||postfix.charAt(i)=='-' ||
                    postfix.charAt(i)=='*'||postfix.charAt(i)=='/'){
                StringBuffer res=new StringBuffer();
                String second=arr.pop();
                String first=arr.pop();
                res.append('(');
                res.append(first);
                res.append(postfix.charAt(i));
                res.append(second);
                res.append(')');
                arr.push(res.toString());
            }else{
                StringBuffer res=new StringBuffer();
                res.append(postfix.charAt(i));
                arr.push(res.toString());
            }

        }
        return arr.pop();
    }
}
