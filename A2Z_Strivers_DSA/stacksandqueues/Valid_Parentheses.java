package A2Z_Strivers_DSA.stacksandqueues;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));

    }
    public static boolean isValid(String s) {
        Stack<Character>res=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                res.push(s.charAt(i));
            }
            else if (!res.isEmpty()){
                if (s.charAt(i)==')'){
                    if (res.peek()=='('){
                    res.pop();
                    }
                    else{
                        return false;
                    }
                }

               else  if (s.charAt(i)==']'){
                    if (res.peek()=='['){
                        res.pop();
                    }
                    else{
                        return false;
                    }
                }

                else if (s.charAt(i)=='}'){
                    if (res.peek()=='{'){
                        res.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        return res.isEmpty();
    }
    public static boolean isValidpa(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}
