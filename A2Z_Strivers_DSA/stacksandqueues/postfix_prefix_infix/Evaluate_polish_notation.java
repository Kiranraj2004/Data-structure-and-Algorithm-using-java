package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Objects;
import java.util.Stack;

public class Evaluate_polish_notation {
    public static void main(String[] args) {
        String[] s={"*","+","2","1","+","/","9","8","2"};
        System.out.println(evalPn(s));
    }
    public static  int evalPn(String[] tokens) {
        int start=0;
        int end=tokens.length-1;
        while(start<=end){
            String temp=tokens[start];
            tokens[start]=tokens[end];
            tokens[end]=temp;
            end--;
            start++;
        }
        Stack<Integer> res=new Stack<>();
        for (String token : tokens) {
            if (Objects.equals(token, "+") || Objects.equals(token, "-") ||
                    (Objects.equals(token, "/")) || (Objects.equals(token, "*"))) {
                int first = res.pop();
                int second = res.pop();
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
