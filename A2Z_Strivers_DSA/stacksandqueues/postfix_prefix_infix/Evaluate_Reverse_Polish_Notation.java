package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Objects;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String []s={"4","13","5","/","+"};
        System.out.println(evalRPN(s));
//        System.out.println(number("-239"));
    }
    public static  int evalRPN(String[] tokens) {
        Stack<Integer>res=new Stack<>();
        for (String token : tokens) {
            if (Objects.equals(token, "+") || Objects.equals(token, "-") ||
                    (Objects.equals(token, "/")) || (Objects.equals(token, "*"))) {
                int second = res.pop();
                int first = res.pop();
                switch (token) {
                    case "+" -> res.push(first + second);
                    case "-" -> res.push(first - second);
                    case "*" -> res.push(first * second);
                    case "/" -> res.push(first / second);
                }
            } else {
                res.push(number(token));
            }
        }
        return res.pop();
    }
    static int number(String s){
        int num=0;
        for (int i = 0; i <s.length() ; i++) {
          if (s.charAt(i)!='-') {
              num *= 10;
              num += (int) s.charAt(i) - 48;
          }
        }
        if (s.charAt(0)=='-'){
            num*=-1;
        }
        return num;
    }
}
