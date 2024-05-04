package geeksforgeeks.stacks;

import java.util.Stack;

public class Parenthesis_Checke {
    public static void main(String[] args) {
        String s="{([])}";
        System.out.println(ispar(s));

    }
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<Character>();
        for (char it : x.toCharArray()) {
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
