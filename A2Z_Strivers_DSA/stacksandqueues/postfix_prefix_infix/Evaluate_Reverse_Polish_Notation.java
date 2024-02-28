package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String []s={"2","1","+","3","*"};
    }
    public static  int evalRPN(String[] tokens) {
        Stack<Integer>res=new Stack<>();
        for (int i = 0; i <tokens.length ; i++) {
            if (tokens[i]!="+"||tokens[i]!="-"||tokens[i]!="/"||tokens[i]!="*"){
                char num=(char)tokens[i].charAt(0);
            }
        }
    }
}
