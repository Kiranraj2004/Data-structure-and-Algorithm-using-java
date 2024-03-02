package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class infix_to_prefix {
    public static void main(String[] args) {
        String s="(A-B/C)*(A/K-L)";
        System.out.println(infixtoprefix(s));
    }
    public static String infixtoprefix(String q){
        StringBuffer a=new StringBuffer(q);
       a.reverse();
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)==')'){
                a.setCharAt(i,'(');
            }
           else if(a.charAt(i)=='('){
                a.setCharAt(i,')');
            }
        }
        System.out.println(a);
        String s=a.toString();
        Stack<Character>res=new Stack<>();
        StringBuffer ans=new StringBuffer();
//        there we are going to by reverse order
        String operator="-+/*^()";
        for (int i = 0; i <s.length() ; i++) {
            if (operator.indexOf(s.charAt(i))==-1){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                res.push('(');
            }
            else if(s.charAt(i)==')'){
                while(res.peek()!='('){
                    ans.append(res.pop());
                }
                res.pop();
            }
            else{
                    while (!res.isEmpty()&&Prec(s.charAt(i))<Prec(res.peek())){
                        ans.append(res.pop());
                    }
                    res.push(s.charAt(i));
            }
        }
        while (!res.isEmpty()){
            ans.append(res.pop());
        }
        return ans.reverse().toString();
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
