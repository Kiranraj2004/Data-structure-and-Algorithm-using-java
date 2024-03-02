package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class Infix_to_Postfix {
    public static void main(String[] args) {
        String exp = " (2+1)*(9/8+2)" ;
        System.out.println(infixToPostfix(exp));
    }
    static String infixToPostfix(String exp){
        StringBuffer result=new StringBuffer();
        Stack<Character>res=new Stack<>();
        String operator="*+-/^";
        for (int i = 0; i <exp.length() ; i++) {
            if (exp.charAt(i)=='('){
                res.push('(');
            }else if(exp.charAt(i)==')'){
                while (res.peek()!='('&&!res.isEmpty()){
                    result.append(res.pop());
                }
                res.pop();
            }
            else if(operator.indexOf(exp.charAt(i))!=-1){

                while(!res.isEmpty()&&Prec(exp.charAt(i))<=Prec(res.peek())){
                   result.append(res.pop());
                }
                res.push(exp.charAt(i));

            }
            else{
                result.append(exp.charAt(i));
            }
        }
        while (!res.isEmpty()){
            result.append(res.pop());
        }
        return result.toString();
    }
    static int Prec(char ch) {
        int i = switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
        return i;
    }

}
