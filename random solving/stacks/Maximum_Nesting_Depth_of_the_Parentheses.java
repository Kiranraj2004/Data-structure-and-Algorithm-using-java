package stacks;

import java.util.Stack;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        Stack<Character>res=new Stack<>();
        int max=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                res.push('(');
            }
            else if(s.charAt(i)==')'){
                max=Math.max(max,res.size());
                res.pop();
            }
        }
         return max-res.size();
    }
}
