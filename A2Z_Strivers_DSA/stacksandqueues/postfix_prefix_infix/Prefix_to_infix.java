package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class Prefix_to_infix {
    public static void main(String[] args) {
        String s="*-A/BC-/AKL";
        System.out.println(prefixtoinfix(s));
    }
    public static String prefixtoinfix(String prefix){
        StringBuffer reverse=new StringBuffer(prefix);
        reverse.reverse();
        Stack<String>res=new Stack<>();
        for (int i = 0; i <reverse.length() ; i++) {
            if (reverse.charAt(i)=='+'||reverse.charAt(i)=='*'||
                    reverse.charAt(i)=='-'||reverse.charAt(i)=='/'){
                StringBuffer ans=new StringBuffer();
                String second=res.pop();
                String first=res.pop();
                ans.append(')');
                ans.append(first);
                ans.append(reverse.charAt(i));
                ans.append(second);
                ans.append('(');
                res.push(ans.toString());
            }else{
                StringBuffer re=new StringBuffer();
                re.append(reverse.charAt(i));
                res.push(re.toString());
            }
        }
       StringBuffer original=new StringBuffer(res.pop().toString());
        return original.reverse().toString();
    }
}
